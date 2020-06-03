package com.atividade2.expedicao.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class expedicao {

    @PostMapping("/")
    public String compra(@RequestBody String compra) {
        return "Resposta de expedicao: " + compra;
    }
}