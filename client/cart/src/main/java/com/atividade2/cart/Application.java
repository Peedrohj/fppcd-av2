package com.atividade2.cart;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        final Carrinho cart = new Carrinho();

        final String[] produtos = { "Produto 1", "Produto 2", "Produto 3" };
        final String[] urls = { "http://localhost:8081/", "http://localhost:8082/", "http://localhost:8083/" };

        cart.setCep("00.000.00");
        cart.setEmail("phjfg@cesar.school");
        cart.setSku(produtos);
        cart.setValor("130,00");

        cart.comprar(cart, urls);
    }

}
