package com.example.spring_template.repositories;

import com.example.spring_template.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<Livro, Long> {
}
