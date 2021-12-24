/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicweb.controllers;

import com.medicweb.pojo.User;
import com.medicweb.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author QUYENNGUYEN
 */
@Controller
public class PatientController {
   
    
    @Autowired
    private UserService userDetailsService;
    
    @RequestMapping("/login")
    public String login(Model model){
        return "login";
    }
     @GetMapping("/register")
    public String registerView(Model model){
        model.addAttribute("user",new User());
        return "register";
    }
    @PostMapping("/register")
    public String register(Model model, @ModelAttribute(value = "user") @Valid User user,
             BindingResult result) {
        
        if (!result.hasErrors()) {
            Long count = userDetailsService.checkEmail(user.getEmail().trim());
            if (count == 1) {
                model.addAttribute("errEmailMsg", "Email đã tồn tại!");
            } else
                if (user.getPassword().isEmpty()
                        || !user.getPassword().equals(user.getConfirmPassword())) {
                    model.addAttribute("errMsg", "Mật khẩu không đúng!");
                }
                else if (this.userDetailsService.addUser(user) == true) {
                        return "redirect:/login";
                } 
        }
         return "register";
    }
    // 
}