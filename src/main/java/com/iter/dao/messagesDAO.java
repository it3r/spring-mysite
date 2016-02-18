package com.iter.dao;

import com.iter.hentities.MessagesEntity;

import java.util.List;

public interface messagesDAO {
    public void addMessage( MessagesEntity message );
    public List<MessagesEntity> getMessages();
}
