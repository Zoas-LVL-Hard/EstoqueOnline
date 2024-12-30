package com.center.stock.estoque_online.produto.domain;

public enum Unidade {
    EUNAPOLIS("Eunápolis"), PORTO_SEGURO("Porto Seguro"), VILA_VELHA("Vila Velha");

    private String item;

    Unidade(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
