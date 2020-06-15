package com.biblioteca.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.model.livro;

@Repository
public interface livroRepository extends JpaRepository<livro, Long> {
	public List<livro>findAllByNomeContainingIgnoreCase(String nome);

}
