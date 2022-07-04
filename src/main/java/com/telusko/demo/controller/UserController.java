package com.telusko.demo.controller;

import com.telusko.demo.dao.UserRepo;
import com.telusko.demo.model.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserRepo urepo;

    @RequestMapping(path="/login",method = {RequestMethod.GET})
    public String getLogin()
    {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login_user(@RequestParam("user_email") String user_email, @RequestParam("user_pass") String user_pass)
    {
        Userlogin auser=urepo.findByUsernamePassword(user_email, user_pass);

        if(auser!=null)
        {

            String uname=auser.getUser_email();
            String upass=auser.getUser_pass();
            if(user_email.equalsIgnoreCase(uname) && user_pass.equalsIgnoreCase(upass))
            {
                ModelAndView mv=new ModelAndView("home");
                mv.addObject("user_email",user_email);
                return mv;
                //session.setAttribute("user_email",user_email);
                //return "home";
            }
            else
            {
                ModelAndView mv=new ModelAndView("login");
                mv.addObject("error","Invalid username or password");
                return mv;

                /*modelMap.put("error", "Invalid Account");
                return "login";*/
            }
        }
        else
        {
            ModelAndView mv=new ModelAndView("login");
            mv.addObject("error","Invalid Account");
            return mv;
           /* modelMap.put("error", "Invalid Account");
            return "login";*/
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
