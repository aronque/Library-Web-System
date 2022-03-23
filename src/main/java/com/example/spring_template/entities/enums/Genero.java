package com.example.spring_template.entities.enums;

public enum Genero {
    TERROR(1),
    COMEDIA(2),
    ROMANCE(3),
    SCIFI(4);

    public int valor;

    Genero(int valor) {
        this.valor = valor;
    }
}
