package com.telusko.demo.controller;

import com.telusko.demo.dao.UserRepo;
import com.telusko.demo.model.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserRepo urepo;

    @RequestMapping("/login")
    public String getLogin()
    {
        return "login";
    }

    @PostMapping("/login")
    public String login_user(@RequestParam("user_email") String user_email, @RequestParam("user_pass") String user_pass,
                             HttpSession session, ModelMap modelMap)
    {
        Userlogin auser=urepo.findByUsernamePassword(user_email, user_pass);
        if(auser!=null)
        {
            String uname=auser.getUser_email();
            String upass=auser.getUser_pass();
            if(user_email.equalsIgnoreCase(uname) && user_pass.equalsIgnoreCase(upass))
            {
                session.setAttribute("user_email",user_email);
                return "home";
            }
            else
            {
                modelMap.put("error", "Invalid Account");
                return "login";
            }
        }
        else
        {
            modelMap.put("error", "Invalid Account");
            return "login";
        }

    }
    @GetMapping(value = "/logout")
    public String logout_user(HttpSession session)
    {
        session.removeAttribute("username");
        session.invalidate();
        return "redirect:/login";
    }

}
