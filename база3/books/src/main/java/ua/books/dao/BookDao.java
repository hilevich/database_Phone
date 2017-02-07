package ua.books.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.books.entety.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

}
