package com.valid.dao;

 import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.valid.model.infoDb;

@Repository
public interface InfoDbDao extends CrudRepository<infoDb, Long> {
     @SuppressWarnings("unchecked")
	  infoDb save(infoDb username);
      List<infoDb> findAll();
     

}
