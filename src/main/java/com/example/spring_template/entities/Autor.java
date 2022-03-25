package com.example.spring_template.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_autores")
public class Autor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "autor")
    private Set<Livro> livros = new HashSet<>();

    public Autor(){
    }

    public Autor(String name) {
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

    public Set<Livro> getLivros() {
        return livros.stream().sorted().collect(Collectors.toSet());
    }

    public void setLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public String toString() {
        return "Autor: " +
                "\n||" + name;
    }
}
