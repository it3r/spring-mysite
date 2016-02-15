package com.iter.service;

import com.iter.dao.InfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

//@Service
public class InfoService {

    //@Autowired
    private InfoDao infoDao = null;

    public String getAboutMe(){
        return infoDao.getAboutMe();
    }

    public Map<String ,String> getTechnologies(){
        return infoDao.getTechnologies();
    }
}
