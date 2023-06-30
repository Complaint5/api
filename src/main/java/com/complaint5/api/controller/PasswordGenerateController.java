package com.complaint5.api.controller;

import com.complaint5.api.service.PasswordGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordGenerateController {
    
    @Autowired
    private PasswordGenerateService passwordGenerateService;
    
    @GetMapping
    public String password(){
        return passwordGenerateService.passwordGenerate();
    }
}
