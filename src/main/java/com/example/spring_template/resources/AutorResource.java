package com.example.spring_template.resources;

import com.example.spring_template.entities.Autor;
import com.example.spring_template.entities.Autor;
import com.example.spring_template.entities.enums.Genero;
import com.example.spring_template.mock.MockData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorResource {

    @GetMapping("/{id}")
    ResponseEntity<Autor> findAutor(@PathVariable int id) {
        return ResponseEntity.ok(new Autor("Mefisto"));
    }

    @GetMapping("")
    ResponseEntity<List<Autor>> findAll() {
        List<Autor> list = MockData.getAutores();
        return ResponseEntity.ok(list);
    }

}
