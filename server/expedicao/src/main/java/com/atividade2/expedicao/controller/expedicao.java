package com.atividade2.expedicao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class expedicao {
    
    @PostMapping("/")  
    public String getMethodName(@RequestBody String compra) {
        return compra;
    }
}