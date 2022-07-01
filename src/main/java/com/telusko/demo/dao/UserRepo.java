package com.telusko.demo.dao;

import com.telusko.demo.controller.UserController;
import com.telusko.demo.model.Userlogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Userlogin,Integer> {
    @Query("from Userlogin where user_email=?1 and user_pass=?2")
    public Userlogin findByUsernamePassword(String username, String password);
}
