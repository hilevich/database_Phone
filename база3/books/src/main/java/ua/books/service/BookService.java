package ua.books.service;

import java.util.List;

import ua.books.entety.Book;



public interface BookService {

	void save(Book book);
	
	List<Book> findAll();
	
	Book findOneByID (int idBook);
	
	
	void deleteById (int idBook);
	
	Book findByName (String nameBook);
	
	void addAutorToBook (int idAutors, int idBook);
	
	
}
