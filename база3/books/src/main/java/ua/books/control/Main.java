package ua.books.control;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.books.entety.Autor;
import ua.books.entety.Book;
import ua.books.entety.User;
import ua.books.service.AutorService;
import ua.books.service.BookService;
import ua.books.service.UserService;
import ua.books.serviceImpl.AutorServiceImpl;
import ua.books.serviceImpl.BookServiceImpl;
import ua.books.serviceImpl.UserServiceImpl;




public class Main {
	public static void main(String[] args) {
		
	//	ConsoleMenu consoleMenu = new ConsoleMenu();
		
	//	consoleMenu.switchMenu();
		

		ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
		
		
		
		
		AutorService autor = context.getBean(AutorServiceImpl.class);
		
		BookService bookS = context.getBean(BookServiceImpl.class);
		
		UserService userS = context.getBean(UserServiceImpl.class);
	
		
		
		userS.save(new User("Andriy", "Hilevich"));
		
		userS.addBookToUser(1, 1);
	
		context.close();
	}
}
		