package com.example.spring_template.entities;

import com.example.spring_template.entities.enums.Genero;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "tb_livros")
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 75)
    private String name;

    @ManyToOne
    private Autor autor;
    @Column(length = 12)
    private String disponibilidade;
    private Genero genero;
    private Calendar lancamento = Calendar.getInstance();

    public Livro() {
    }

    public Livro(String name, Autor autor, Disponibilidade disponibilidade, Genero genero, int anoLancamento) {
        this.name = name;
        this.autor = autor;
        this.disponibilidade = disponibilidade.stringValue();
        this.genero = genero;
        lancamento.set(Calendar.YEAR, anoLancamento);
    }

    public enum Disponibilidade {
        DISPONIBLE(1),
        INDISPONIBLE(0);

        private int value;

        Disponibilidade(int value) {
            this.value = value;
        }

        public String stringValue() {
            switch (value) {
                case 0:
                    return "Indisponível";
                case 1:
                    return "Disponível";
            }
            return "";
        }
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

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade.stringValue();
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calendar getLancamento() {
        return lancamento;
    }

    public void setLancamento(Calendar lancamento) {
        this.lancamento = lancamento;
    }
}
