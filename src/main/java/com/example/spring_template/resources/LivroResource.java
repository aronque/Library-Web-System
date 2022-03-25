package com.example.spring_template.resources;

import com.example.spring_template.entities.Autor;
import com.example.spring_template.entities.Livro;
import com.example.spring_template.entities.enums.Genero;
import com.example.spring_template.mock.MockData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroResource {

    @GetMapping("/{id}")
    ResponseEntity<Livro> findLivro(@PathVariable int id) {
        return ResponseEntity.ok(new Livro("Admirável Mundo Novo", new Autor("Huxley") , Livro.Disponibilidade.DISPONIBLE, Genero.DYSTOPIA, 1932));
    }

    @GetMapping("")
    ResponseEntity<List<Livro>> findAll() {
        List<Livro> list = MockData.getLivros();
        return ResponseEntity.ok(list);
    }

}
