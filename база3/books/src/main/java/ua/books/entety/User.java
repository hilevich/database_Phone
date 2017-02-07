package ua.books.entety;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User {
	
	@Id
	@Column (name = "idUser")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@Column (name = "nameUser")
	private String nameUser;
	
	@Column (name = "surName")
	private String surName;
	
	@OneToMany(mappedBy="user")
	private List<Book> books;


	public User() {
		super();
	}

	public User(String nameUser, String surName, List<Book> books) {
		super();
		this.nameUser = nameUser;
		this.surName = surName;
		this.books = books;
	}

	public User(String nameUser, String surName) {
		super();
		this.nameUser = nameUser;
		this.surName = surName;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	
	public String toString() {
		return "User [idUser=" + idUser + ", nameUser=" + nameUser + ", surName=" + surName + ", books=" + books + "]";
	}
	
	

}
