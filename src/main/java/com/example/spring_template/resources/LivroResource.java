package com.example.spring_template.resources;

import com.example.spring_template.entities.Livro;
import com.example.spring_template.repositories.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroResource {

    @Autowired
    private LivrosRepository repository;

    @GetMapping("/{id}")
    ResponseEntity<Livro> findLivro(@PathVariable Long id) {
        Livro livro = repository.getById(id);
        return ResponseEntity.ok(livro);
    }

    @GetMapping("")
    ResponseEntity<List<Livro>> findAll() {
        List<Livro> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/insert")
    public ResponseEntity<Livro> insertLivro(@RequestBody Livro livro) {
        Livro livroAux = null;
        try {
            livroAux = repository.save(livro);
            return new ResponseEntity<>(livroAux, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(livroAux, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
