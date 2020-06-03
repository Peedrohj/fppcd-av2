package com.atividade2.cobranca.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class cobranca {

    @PostMapping("/")  
    public String compra(@RequestBody String compra) {
        return "Resposta de cobranca: " + compra;
    }
}