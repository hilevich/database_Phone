package ua.books.entety;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table (name = "autor")
public class Autor {

	@Id
	@Column (name = "idAutor")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAutor;
	
	@Column (name = "NameAutor")
	private String NameAutor;
	
	@Column (name = "surNAmeAutor")
	private String surNAmeAutor;
	
	@ManyToMany
	@JoinTable (name = "autor_book", joinColumns = @JoinColumn(name = "id_autor"), inverseJoinColumns = @JoinColumn(name ="id_book"))
	List<Book> book;

	public Autor() {
		super();
	}

	public Autor(String nameAutor, String surNAmeAutor) {
		super();
		NameAutor = nameAutor;
		this.surNAmeAutor = surNAmeAutor;
	}

	public Autor(String nameAutor, String surNAmeAutor, List<Book> book) {
		super();
		NameAutor = nameAutor;
		this.surNAmeAutor = surNAmeAutor;
		this.book = book;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNameAutor() {
		return NameAutor;
	}

	public void setNameAutor(String nameAutor) {
		NameAutor = nameAutor;
	}

	public String getSurNAmeAutor() {
		return surNAmeAutor;
	}

	public void setSurNAmeAutor(String surNAmeAutor) {
		this.surNAmeAutor = surNAmeAutor;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", NameAutor=" + NameAutor + ", surNAmeAutor=" + surNAmeAutor + "]";
	}
	
	
}
