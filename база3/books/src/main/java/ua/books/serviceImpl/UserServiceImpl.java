package ua.books.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.books.dao.BookDao;
import ua.books.dao.UserDao;
import ua.books.entety.Book;
import ua.books.entety.User;
import ua.books.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	private BookDao bookDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

	@Override
	public User findOneByID(int idUser) {
		return userDao.findOne(idUser);
	}

	@Override
	public void deleteById(int idUser) {
		userDao.delete(idUser);
		
	}


	@Override
	public void addBookToUser(int idBooks, int idUser) {
		
		Book book = bookDao.findOne(idBooks);
		
		User user = userDao.findOne(idUser);
		
		user.getBooks().add(book);
		
		userDao.save(user);
		
	}

	@Override
	public User findByName(String nameUser, String surName) {
		// TODO Auto-generated method stub
		return null;
	}

}
