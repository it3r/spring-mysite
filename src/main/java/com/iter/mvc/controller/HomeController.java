package com.iter.mvc.controller;

import com.iter.InfoDao;
import com.iter.hentities.MessagesEntity;
import com.iter.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    InfoDao dao;

	@RequestMapping("/")
    public String goAboutMe( Model model ){
        model.addAttribute( "aboutMeInfo", dao.getAboutMe() );
        return "aboutMe";
    }

    @RequestMapping("/aboutsite")
    public String goAboutSite( Model model ){
        model.addAttribute( "techMap", dao.getTechnologies() );
        return "aboutSite";
    }

    @Autowired
    private MessagesService messagesService;

    @RequestMapping("/messages")
    public String goMessagesToMe( Model model ){
        List<MessagesEntity> messList = messagesService.getMessages();
        Map<String,String> messages = new HashMap<String, String>(  );
        for ( MessagesEntity m : messList ){
            messages.put( m.getAuthor(), m.getMessagebody() );
        }
        model.addAttribute( "mesMap" , messages );
        return "messages";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String goLogin( ){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login( Model model ){
        return "login";
    }

    @RequestMapping(value = "/contactme", method = RequestMethod.POST)
    public String contactMe(
        @RequestParam("e-mail") String email,
        @RequestParam("message-body") String mBody){
        MessagesEntity message = new MessagesEntity();
        message.setAuthor( email );
        message.setMessagebody( mBody );
        System.out.println( email + mBody );
        messagesService.addMessage( message );
        return "contact";
    }

}
