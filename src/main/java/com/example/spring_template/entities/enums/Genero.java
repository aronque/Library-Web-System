package com.example.spring_template.entities.enums;

public enum Genero {
    TERROR(1, "Terror"),
    COMEDIA(2, "Comedia"),
    ROMANCE(3, "Romance"),
    SCIFI(4, "Scifi"),
    DYSTOPIA(5, "Dystopia"),
    HISTORY(6, "History"),
    ACTION(7, "Action");

    public int valor;

    Genero(int valor, String code) {
        this.valor = valor;
    }
}
