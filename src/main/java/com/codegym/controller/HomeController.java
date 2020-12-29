package com.codegym.controller;

import com.codegym.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/home")
    public ModelAndView showUsers() {
        ModelAndView modelAndView = new ModelAndView("user-home");
        modelAndView.addObject("users", userRepository.findAll());
        return modelAndView;
    }

}
