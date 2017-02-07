package ua.books.service;

import java.util.List;

import ua.books.entety.User;


public interface UserService {

	void save(User user);
	
	List<User> findAll();
	
	User findOneByID (int idUser);
	
	
	void deleteById (int idUser);
	
	User findByName (String nameUser, String surName);
	
	void addBookToUser (int idBooks, int idUser);
}
