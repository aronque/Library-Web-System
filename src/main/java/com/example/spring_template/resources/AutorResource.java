package com.example.spring_template.resources;

import com.example.spring_template.entities.Autor;
import com.example.spring_template.repositories.AutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorResource {

    @Autowired
    private AutoresRepository repository;

    @GetMapping("/{id}")
    ResponseEntity<Autor> findAutor(@PathVariable Long id) {
        Autor autor = repository.getById(id);
        return ResponseEntity.ok(autor);
    }

    @GetMapping("")
    ResponseEntity<List<Autor>> findAll() {
        List<Autor> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/insert")
    public ResponseEntity<Autor> insertAutor(@RequestBody Autor autor) {
        Autor autorAux = null;
        try {
             autorAux = repository.save(autor);
             return new ResponseEntity<Autor>(autorAux,HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Autor>(autorAux,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
