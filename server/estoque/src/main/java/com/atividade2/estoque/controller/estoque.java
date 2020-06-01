package com.atividade2.estoque.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class estoque {

    @PostMapping("/")  
    public String getMethodName(@RequestBody String compra) {
        return compra;
    }
}