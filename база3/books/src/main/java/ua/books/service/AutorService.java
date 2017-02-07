package ua.books.service;

import java.util.List;

import ua.books.entety.Autor;


public interface AutorService{

	void save(Autor autor);
	
	List<Autor> findAll();
	
	Autor findOneByID (int idAutor);
	
	
	void deleteById (int idAutor);
	
	Autor findByName (String nameAutor, String surNameAutor);
	
	void addBookToAutor (int idBooks, int idAutor);
}
