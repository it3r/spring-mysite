package com.iter.service;

import com.iter.dao.messagesDAO;
import com.iter.hentities.MessagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class MessagesServiceImpl implements MessagesService{

    public MessagesServiceImpl(){

    }

    @Autowired
    private messagesDAO messagesDAO;

    @Transactional
    public void addMessage( MessagesEntity message ) {
        messagesDAO.addMessage( message );
    }

    @Transactional
    public List<MessagesEntity> getMessages() {
        return messagesDAO.getMessages();
    }
}
