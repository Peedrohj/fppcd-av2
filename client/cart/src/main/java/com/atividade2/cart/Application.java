package com.atividade2.cart;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Carrinho cart = new Carrinho();
        String[] produtos = { "Produto 1", "Produto 2", "Produto 3" };

        cart.setCep("00.000.00");
        cart.setEmail("phjfg@cesar.school");
        cart.setSku(produtos);
        cart.setValor("130,00");

        System.out.println(cart.comprar(cart, "http://localhost:8081/"));
    }

}
