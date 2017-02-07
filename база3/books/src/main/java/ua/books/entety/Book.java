package ua.books.entety;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "book")
public class Book {
	
	@Id
	@Column (name = "idBook") 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idBook;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "numberPage")
	private int numberPage;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser")
	User user;
	
	@ManyToMany
	@JoinTable (name = "autor_book", joinColumns = @JoinColumn(name = "id_book"), inverseJoinColumns = @JoinColumn(name = "id_autor"))
	List<Autor> autor;

	public Book() {
		super();
	}

	public Book(String title, int numberPage) {
		super();
		this.title = title;
		this.numberPage = numberPage;
	}

	public Book(String title, int numberPage, User user) {
		super();
		this.title = title;
		this.numberPage = numberPage;
		this.user = user;
	}

	public Book(String title, int numberPage, List<Autor> autor) {
		super();
		this.title = title;
		this.numberPage = numberPage;
		this.autor = autor;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberPage() {
		return numberPage;
	}

	public void setNumberPage(int numberPage) {
		this.numberPage = numberPage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Autor> getAutor() {
		return autor;
	}

	public void setAutor(List<Autor> autor) {
		this.autor = autor;
	}

	
	public String toString() {
		return "Book [idBook=" + idBook + ", title=" + title + ", numberPage=" + numberPage + ", user=" + user
				+ ", autor=" + autor + "]";
	}
	
	
}
