/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.controllers;

import com.ndt.pojos.User;
import com.ndt.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author TUN
 */
@Controller
public class UserController {
    @Autowired
    private UserService userDetailsService;
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/register")
    public String registerView(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    
    @PostMapping("/register")
    public String register(Model model, @ModelAttribute(value = "user") User user) {
        String errMsg = "";
        System.out.println("2183219649136491269384");
        if (user.getPassword().equals(user.getConfirmPassword())) {
            if (!this.userDetailsService.addUser(user))
                errMsg = "Error!!!";
            else
                return "redirect:/login";
        }else
            errMsg = "Invalid password";
        
        model.addAttribute("errMsg", errMsg);
        return "register";
    }
}
