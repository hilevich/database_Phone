package ua.books.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.books.entety.Autor;

public interface AutorDao extends JpaRepository<Autor, Integer>{
	
//	@Query("select d from Autor d where d.NameAutor=:name d.surNAmeAutor=:surname")
//	public Autor findAutorByName(@Param("name")String name, @Param("surname")String surname);
}
