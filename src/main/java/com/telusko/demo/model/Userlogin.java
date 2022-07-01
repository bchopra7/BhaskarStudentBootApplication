package com.telusko.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userlogin {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    private String user_email;
    private String user_pass;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_email='" + user_email + '\'' +
                ", user_pass='" + user_pass + '\'' +
                '}';
    }
}
