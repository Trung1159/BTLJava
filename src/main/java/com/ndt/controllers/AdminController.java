package com.ndt.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ndt.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userDetailsService;
    
    @GetMapping("")
    public String index(Model model) {

        List<String> roles = new ArrayList<>();
        roles.add("ROLE_ADMIN");
        roles.add("ROLE_USER");
        roles.add("ROLE_TEACHER");

        model.addAttribute("users", this.userDetailsService.getUsers());
        model.addAttribute("roles", roles);
        return "adminIndex";
    }

    @GetMapping("user-manager")
    public String userManager() {

        return "user-manager";
    }

}
