package com.telusko.demo.controller;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;
import com.telusko.demo.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AlienController   {
    @Autowired
    private AlienService service;

    @GetMapping("/dashboard")
    public String home(){
        return "home";
    }
   @GetMapping("/viewAliens")
    public String viewAliens(Model model) {
        List<Alien> listAlien = service.listAll();
        model.addAttribute("listalien", listAlien);
        System.out.print("Get / ");
        return "details";
    }

    @PostMapping("/addAlien")
    //@RequestMapping(value = "/addAlien", method = { RequestMethod.POST })
    //@RequestMapping("/addAlien")
    //All same
    public String addAlien(Alien alien)
    {
        service.save(alien);
        return "home";
    }

    @GetMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid)
    {
        ModelAndView mv=new ModelAndView("showAlien");
        Alien alien=service.get(aid);
        mv.addObject(alien);
        return mv;
    }

    @RequestMapping(value="/deleteAlien",method = { RequestMethod.POST})
    @ResponseBody
    public String deleteAlien(@RequestParam int aid)
    {
        service.delete(aid);
       return "Sucessfully deleted details of "+aid;
    }
   // @RequestMapping("/editAlien")
    @RequestMapping(value="/editAlien",method = { RequestMethod.POST})
    public ModelAndView showEditStudentPage(@RequestParam int aid) {
        ModelAndView mv=new ModelAndView("edited");
        Alien alien=service.get(aid);
        mv.addObject(alien);
        return mv;
    }
}
