package com.iter.dao;

import com.iter.hentities.MessagesEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class messagesDAOImpl implements messagesDAO {

    public messagesDAOImpl(){
    }
    @Autowired
    private SessionFactory sessionFactory;

    public void addMessage( MessagesEntity message ) {
        sessionFactory.getCurrentSession().save( message );
    }

    @SuppressWarnings( "unchecked" )
    public List<MessagesEntity> getMessages() {
        return sessionFactory.getCurrentSession().createCriteria( MessagesEntity.class ).list();
    }
}
