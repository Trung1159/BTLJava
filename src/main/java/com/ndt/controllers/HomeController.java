/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ndt.service.KhoaluanService;



/**
 *
 * @author TUN
 */

@Controller
public class HomeController {
    @Autowired
    private KhoaluanService khoaluanService;
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("khoaluans", this.khoaluanService.getKhoaluans());
        return "index";
    }
    
}
