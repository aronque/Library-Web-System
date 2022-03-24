package com.example.spring_template.entities;

import com.example.spring_template.entities.enums.Disponibilidade;
import com.example.spring_template.entities.enums.Genero;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_livros")
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Autor autor;
    private Disponibilidade disponibilidade;
    private Genero genero;
    private Date lancamento;

    public Livro(){
    }

    public Livro(Autor autor, Disponibilidade disponibilidade, Genero genero, Date lancamento){
        this.autor = autor;
        this.disponibilidade = disponibilidade;
        this.genero = genero;
        this.lancamento = lancamento;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }
}
