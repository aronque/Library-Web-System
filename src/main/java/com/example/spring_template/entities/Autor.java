package com.example.spring_template.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Autor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    private Set<Livro> livros = new HashSet<>();

    public Autor(){
    }

    public Autor(String name, Integer age) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Autor: " +
                "\n||" + name;
    }
}
