package ua.books.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.books.dao.AutorDao;
import ua.books.dao.BookDao;
import ua.books.entety.Autor;
import ua.books.entety.Book;
import ua.books.service.AutorService;


@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorDao autorDao;

	@Autowired
	private BookDao bookDao;
	
	@Override
	public void save(Autor autor) {
		autorDao.save(autor);
		
	}

	@Override
	public List<Autor> findAll() {
		
		return autorDao.findAll();
	}

	@Override
	public Autor findOneByID(int idAutor) {
		
		return autorDao.findOne(idAutor);
	}

	@Override
	public void deleteById(int idAutor) {
		autorDao.delete(idAutor);
		
	}

	@Override
	public Autor findByName(String nameAutor, String surNameAutor) {
		
		return null;
	}

	@Override
	public void addBookToAutor(int idBooks, int idAutor) {
		
		Book book = bookDao.findOne(idBooks);
		
		Autor autor = autorDao.findOne(idAutor);
		
		autor.getBook().add(book);
		
		autorDao.save(autor);
		
	}

}
