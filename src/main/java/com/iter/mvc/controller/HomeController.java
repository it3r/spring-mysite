package com.iter.mvc.controller;

import com.iter.dao.InfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/messages")
    public String goMessagesToMe( Model model ){
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
        System.out.println( email + mBody );
        return "contact";
    }

}
