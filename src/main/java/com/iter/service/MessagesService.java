package com.iter.service;

import com.iter.hentities.MessagesEntity;

import java.util.List;

public interface MessagesService {
    public void addMessage( MessagesEntity message );
    public List<MessagesEntity> getMessages();
}
