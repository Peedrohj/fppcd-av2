package com.atividade2.cart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Carrinho {
    public String email;
    public String cep;
    public String valor;
    public String[] sku;

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(final String cep) {
        this.cep = cep;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(final String valor) {
        this.valor = valor;
    }

    public String[] getSku() {
        return sku;
    }

    public void setSku(final String[] sku) {
        this.sku = sku;
    }

    public ResponseEntity<String> comprar(final Carrinho carrinho, final String url) {
        final RestTemplate restTemplate = new RestTemplate();
        final ResponseEntity<String> responseEntityPerson = restTemplate.postForEntity(url, carrinho, String.class);

        return responseEntityPerson;
    }
}