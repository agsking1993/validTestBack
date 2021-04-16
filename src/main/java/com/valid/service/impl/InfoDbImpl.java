package com.valid.service.impl;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.dao.InfoDbDao;
import com.valid.model.infoDb;
import com.valid.service.InfoDbService;

 


@Service(value = "InfoDbService")
public class InfoDbImpl implements  InfoDbService {
	
	@Autowired
	private InfoDbDao userDao;

     public infoDb save(infoDb user) {
        return userDao.save(user);
    }

	 
	public List<infoDb> findAll() {
        return userDao.findAll();
	}
}
