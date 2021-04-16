package com.valid.service;

import java.util.List;

import com.valid.model.infoDb;


public interface InfoDbService {
	infoDb save(infoDb user);
    List<infoDb> findAll();   
}
