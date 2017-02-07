package ua.books.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.books.dao.AutorDao;
import ua.books.dao.BookDao;
import ua.books.entety.Autor;
import ua.books.entety.Book;
import ua.books.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private AutorDao autorDao;
	
	@Override
	public void save(Book book) {
		bookDao.save(book);
	}

	@Override
	public List<Book> findAll() {
		
		return bookDao.findAll();
	}

	@Override
	public Book findOneByID(int idBook) {
		
		return bookDao.findOne(idBook);
	}

	@Override
	public void deleteById(int idBook) {
		
		bookDao.delete(idBook);
	}

	@Override
	public Book findByName(String nameBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAutorToBook(int idAutors, int idBook) {
		
		Book book = bookDao.findOne(idBook);
		
		Autor autor = autorDao.findOne(idAutors);
		
		book.getAutor().add(autor);
		
		bookDao.save(book);
	}

	
}
