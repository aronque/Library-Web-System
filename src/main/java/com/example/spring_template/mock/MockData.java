package com.example.spring_template.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.spring_template.entities.Autor;
import com.example.spring_template.entities.Livro;
import com.example.spring_template.entities.enums.Genero;

public class MockData {

    public static List<Livro> livros = Arrays.asList(
            new Livro("Admirável Mundo Novo", new Autor("Huxley") , Livro.Disponibilidade.DISPONIBLE, Genero.DYSTOPIA, 1932),
            new Livro("Mayombe", new Autor("Pepetela") , Livro.Disponibilidade.DISPONIBLE, Genero.HISTORY, 1980),
            new Livro("Capitães da Areia", new Autor("Jorge Amado") , Livro.Disponibilidade.INDISPONIBLE, Genero.TERROR, 1937)
    );

    public static List<Autor> autores = Arrays.asList(
            new Autor("Huxley"),
            new Autor("Pepetela"),
            new Autor("Jorge Amado")
    );

    public static List<Livro> getLivros() {
        return livros;
    }

    public static List<Autor> getAutores() {
        return autores;
    }

}
