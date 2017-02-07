package ua.books.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.books.entety.User;



public interface UserDao  extends JpaRepository<User, Integer>{

}
