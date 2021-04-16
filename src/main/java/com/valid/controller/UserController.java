package com.valid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.valid.model.infoDb;
import com.valid.service.InfoDbService;

@RestController
@RequestMapping("/users")
public class UserController {

 
    @Autowired
    private InfoDbService infoDbService;

  
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public infoDb createUser(@RequestBody infoDb user){
        return infoDbService.save(user);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public infoDb updateUser(@RequestBody infoDb user){
        return infoDbService.save(user);
    }   
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<infoDb> listUsers(){
        return infoDbService.findAll();
    }
 
 

}
