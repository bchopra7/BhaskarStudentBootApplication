package com.telusko.demo.service;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {

    @Autowired
    AlienRepo repo;

    public List<Alien> listAll(){
        return repo.findAll();
    }

    public void save(Alien alien){
        repo.save(alien);
    }

    /*public void delete(int aid){
        Alien a=repo.getOne(aid);
        repo.delete(a);
    }*/
    public void delete(int aid) {
        repo.deleteById(aid);
    }

    public Alien get(int aid){
        return repo.findById(aid).orElse(new Alien());
    }



}
