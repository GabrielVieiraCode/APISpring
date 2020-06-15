package com.biblioteca.biblioteca.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="tb_livro" )
public class livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY  )
	private long id;
	@NotNull
	private String nome;
	
	private int qt_pagina;
	@NotNull
	private String autor;
	@NotNull
	private String editora;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQt_pagina() {
		return qt_pagina;
	}

	public void setQt_pagina(int qt_pagina) {
		this.qt_pagina = qt_pagina;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
