package ua.books.console.menu;

import java.util.Scanner;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.books.entety.User;
import ua.books.service.UserService;
import ua.books.serviceImpl.UserServiceImpl;


public class ConsoleMenu {

public void mainMenu(){
		
		System.out.println(" ------------------------------------------------------------ ");
		System.out.println("1 - choise table User");
		System.out.println("2 - choise table Book");
		System.out.println("3 - choise table Autor");
		System.out.println("0 - exit");
		System.out.println(" ------------------------------------------------------------ ");
		
		
	}
	
	
	public void switchMenu(){
		
		boolean flag = true;
		
		

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(flag){
			mainMenu();
		switch (sc.nextLine()) {
		case "1" :{
			System.out.println("1 - choise table User");
	//		userMenu(context);
			System.out.println("1");
			break;
		}
		case "2" :{
			System.out.println("2 - choise table Book");
	//		characteristicsDescripshinMenu(manager);
			
			break;
		}
		case "3" :{
			System.out.println("3 - choise table Autor");
		//	modelPhoneMenu(manager);

			break;
		}
		
		case "0" :{
			System.out.println("0 - exit");
			flag = false;
			break;
		}

		}
	}
	
		
		
	}
	
	public void userMenu(ConfigurableApplicationContext context){
		
		UserService userService = context.getBean(UserServiceImpl.class);
		System.out.println("2");
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag){
		characteristicinfoMenu();	
		switch (sc.nextLine()) {
		
		case "1":{
			System.out.println("1 - save new User");
			String nameUser;
			System.out.println("Enter name");
			nameUser = sc.nextLine();
			String surNameUser;
			System.out.println("Enter surName");
			surNameUser = sc.nextLine();
			System.out.println("new characteristic is created");
			userService.save(new User(nameUser, surNameUser));
			break;
		}
		
		case "2":{
			System.out.println("2 - seach One User For Id");
			int id = 0;
			System.out.println("Enter id");
			try {
				id = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println(userService.findOneByID(id));
			
			break;
		}

		case "3":{
			System.out.println("3 - seach One User For Name and Surname");
			String nameUser;
			System.out.println("Enter name");
			nameUser = sc.nextLine();
			String surNameUser;
			System.out.println("Enter SurName");
			surNameUser = sc.nextLine();
			System.out.println();
			System.out.println(userService.findByName(nameUser, surNameUser));
			
			break;
		}

		case "4":{
			System.out.println("4 - seach all User");
			for (User user : userService.findAll()) {
				System.out.println(user);
			}
			
			break;
		}
		
	
		case "5":{
			System.out.println("5 - remove User for id");
			int id = 0;
			System.out.println("Enter id");
			try {
				id = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
			userService.deleteById(id);
			break;
		}
		case "6":{
			System.out.println("6 - add Book User for id");
			int id = 0;
			System.out.println("Enter id Book");
			try {
				id = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
		//	userService.addBookToUser(id);
			break;
		}
		
		case "0":{
			System.out.println("0 - exit");
			flag = false;
			break;
		}
		}
		}
		
	}
	
	private void characteristicinfoMenu() {
		System.out.println(" ------------------------------------------------------------ ");
		System.out.println("1 - save new User");
		System.out.println("2 - seach One User For Id");
		System.out.println("3 - seach One User For Name and Surname");
		System.out.println("4 - seach all User");
		System.out.println("5 - remove User for id");
		System.out.println("6 - add Book User for id");
		System.out.println("0 - exit");
		System.out.println(" ------------------------------------------------------------ ");
	}


//	public void characteristicsDescripshinMenu(EntityManager manager){
//		
//		
//		
//		CharacteristicsDescripshinDao cdd = new CharacteristicsDescripshinDao(manager);
//				
//		Scanner sc = new Scanner(System.in);
//		
//		boolean flag = true;
//		
//		while(flag){
//			characteristicsDescripshinInfoMenu();
//		switch (sc.nextLine()) {
//		
//		case "1":{
//			System.out.println("1 - add new Characteristics Description");
//			System.out.println("Enter Description");
//			String chdescription;
//			chdescription = sc.nextLine();
//			System.out.println();
//			
//			
//			
//			System.out.println("Enter name of Phone");
//			String namePhone = sc.nextLine();
//			
//			ModelPhone modelPhone =  (ModelPhone)manager.
//					createQuery("select a from ModelPhone a where a.nameModelPhone =:param").
//					setParameter("param", namePhone).
//					getSingleResult();
//			
//			System.out.println("enter id of Characteristic");
//			int idCharacteristic = sc.nextInt();
//			Characteristic characteristic = (Characteristic)manager.
//					createQuery("select p from Characteristic p where p.idCharacteristic =:param").
//					setParameter("param", idCharacteristic).
//					getSingleResult();
//			
//			cdd.addNewChDeskription(new CharacteristicsDescripshin(chdescription, modelPhone, characteristic));
//			break;
//		}
//		
//		case "2":{
//			System.out.println("2 - remove Characteristics Description");
//			System.out.println("Enter Description");
//			int id = sc.nextInt();
//			cdd.removeCharacteristicsDescripshinId(id);
//			break;
//		}
//
//		case "3":{
//			System.out.println("3 - seach one Characteristics Description for ID");
//			System.out.println("Enter Id");
//			int id = sc.nextInt();
//			
//			CharacteristicsDescripshin characteristicsDescripshin = cdd.seachOneCharacteristicsDescripshinId(id);
//			System.out.println(characteristicsDescripshin);
//			break;
//			
//		}
//
//		case "4":{
//			System.out.println("4 - seach all Characteristics Description");
//			
//			for (CharacteristicsDescripshin characteristicsDescripshin : cdd.seachAllCharacteristicsDescripshin()) {
//				System.out.println(characteristicsDescripshin);
//			}
//			
//			break;
//		
//		}
//		case "5":{
//			System.out.println("5 - edite Characteristics Description for ID");
//			System.out.println("Enter Id");
//			int id = sc.nextInt();
//			cdd.editOneCharacteristicsDescripshinForId(id);
//			
//			break;
//		
//		}
//		
//		case "0":{
//			System.out.println("0 - exit");
//			flag = false;
//			break;
//		}
//		}
//		}
//		
//		
//		
//		
//	}
//	
//	private void characteristicsDescripshinInfoMenu() {
//		System.out.println(" ------------------------------------------------------------ ");
//		System.out.println("1 - add new characteristic");
//		System.out.println("2 - remove Characteristics Description");
//		System.out.println("3 - seach one Characteristics Description for ID");
//		System.out.println("4 - seach all Characteristics Description");
//		System.out.println("5 - edite Characteristics Description for ID");
//		System.out.println("0 - exit");
//		System.out.println(" ------------------------------------------------------------ ");
//	}
//
//
//	public void modelPhoneMenu(EntityManager manager){
//		
//		
//		
//		ModelPhoneDao mpd = new ModelPhoneDao(manager);
//				
//		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean flag = true;
//		
//		while(flag){
//			modelPhoneInfoMenu();
//		switch (sc.nextLine()) {
//		
//		case "1":{
//			System.out.println("1 - add new Phone");
//			String namePhone;
//			System.out.println("Enter name");
//			namePhone = sc.nextLine();
//			String descriptionPhone;
//			System.out.println("Enter description Phone");
//			descriptionPhone = sc.nextLine();
//			System.out.println("new repair is created");
//			mpd.addPhone(new ModelPhone(namePhone, descriptionPhone));
//			break;
//		}
//		
//		case "2":{
//			System.out.println("2 - seach One Phone For Id");
//			int id = 0;
//			System.out.println("Enter id");
//			try {
//				id = sc.nextInt();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println();
//			System.out.println(mpd.finOneForId(id));
//			
//			break;
//		}
//
//		case "3":{
//			System.out.println("3 - seach One Phone For Name");
//			String namePhone;
//			System.out.println("Enter name");
//			namePhone = sc.nextLine();
//			System.out.println();
//			System.out.println(mpd.finOneForName(namePhone));
//			
//			break;
//		}
//
//		case "4":{
//			System.out.println("4 - seach all Phone");
//			for (ModelPhone modelPhone : mpd.findAll()) {
//				System.out.println(modelPhone);
//			}
//			
//			break;
//		}
//		
//		case "5":{
//			System.out.println("5 - edit One Phone For Name");
//			String namePhone;
//			System.out.println("Enter name");
//			namePhone = sc.nextLine();
//			System.out.println();
//			mpd.editOneModelPhoneForName(namePhone);
//			break;
//		}
//		case "6":{
//			System.out.println("6 - edit One Phone For ID");
//			int id = 0;
//			System.out.println("Enter id");
//			try {
//				id = sc.nextInt();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println();
//			mpd.editOneModelPhoneForId(id);
//			break;
//		}
//		case "7":{
//			System.out.println("7 - remove Phone for name");
//			String namePhone;
//			System.out.println("Enter name");
//			namePhone = sc.nextLine();
//			System.out.println();
//			mpd.deletePhoneForName(namePhone);
//			break;
//		}
//		case "8":{
//			System.out.println("8 - remove Phone for id");
//			int id = 0;
//			System.out.println("Enter id");
//			try {
//				id = sc.nextInt();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			mpd.deletePhoneForId(id);
//			break;
//		}
//		
//		case "0":{
//			System.out.println("0 - exit");
//			flag = false;
//			break;
//		}
//		}
//		}
//		
//		
//		
//	}
//	
//	private void modelPhoneInfoMenu() {
//		System.out.println(" ------------------------------------------------------------ ");
//		System.out.println("1 - add new Phone");
//		System.out.println("2 - seach One Phone For Id");
//		System.out.println("3 - seach One Phone For Name");
//		System.out.println("4 - seach all Phone");
//		System.out.println("5 - edit One Phone For Name");
//		System.out.println("6 - edit One Phone For ID");
//		System.out.println("7 - remove Phone for name");
//		System.out.println("8 - remove Phone for id");
//		System.out.println("0 - exit");
//		System.out.println(" ------------------------------------------------------------ ");
//	}
//
//
//	public void modelPhoneHasRepairsMenu(){
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
//		
//		EntityManager manager = factory.createEntityManager();
//		
//		ModelPhoneHasRepairsDao mphd = new ModelPhoneHasRepairsDao(manager);				
//		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean flag = true;
//		
//		while(flag){
//			
//		switch (sc.nextLine()) {
//		
//		case "1":{
//			
//			break;
//		}
//		
//		case "2":{
//			
//			break;
//		}
//
//		case "3":{
//	
//			break;
//		}
//
//		case "4":{
//	
//			break;
//		}
//		
//		case "0":{
//			System.out.println("0 - exit");
//			flag = false;
//			break;
//		}
//		}
//		}
//		
//		manager.close();
//		
//		factory.close();
//		
//	}
//	
//	public void repairsMenu(EntityManager manager){
//		
//		RepairsDao rd = new RepairsDao(manager);
//				
//		Scanner sc = new Scanner(System.in);
//		
//		boolean flag = true;
//		
//		while(flag){
//			repairsInfoMenu();
//		switch (sc.nextLine()) {
//		
//		case "1":{
//			System.out.println("1 - add new repair");
//			String nameRepairs;
//			System.out.println("Enter name");
//			nameRepairs = sc.nextLine();
//			System.out.println("new repair is created");
//			rd.addNewRepair(new Repairs(nameRepairs));
//			break;
//		}
//		
//		case "2":{
//			System.out.println("2 - seach One repair For Id");
//			int id = 0;
//			System.out.println("Enter id");
//			try {
//				id = sc.nextInt();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println();
//			System.out.println(rd.seachOneRepairId(id));
//			
//			break;
//		}
//
//		case "3":{
//			System.out.println("3 - seach One repair For Name");
//			String nameRepair;
//			System.out.println("Enter name");
//			nameRepair = sc.nextLine();
//			System.out.println();
//			System.out.println(rd.seachOneRepairName(nameRepair));
//			
//			break;
//		}
//
//		case "4":{
//			System.out.println("4 - seach all Repairs");
//			for (Repairs repairs : rd.seachAllRepair()) {
//				System.out.println(repairs);
//			}
//			
//			break;
//		}
//		
//		case "5":{
//			System.out.println("5 - edit One Repair For Name");
//			String nameRepair;
//			System.out.println("Enter name");
//			nameRepair = sc.nextLine();
//			System.out.println();
//			rd.editOneRepairForName(nameRepair);
//			break;
//		}
//		case "6":{
//			System.out.println("6 - remove Repair for name");
//			String nameRepair;
//			System.out.println("Enter name");
//			nameRepair = sc.nextLine();
//			System.out.println();
//			rd.removeRepairName(nameRepair);
//			break;
//		}
//		case "7":{
//			System.out.println("7 - remove Repair for id");
//			int id = 0;
//			System.out.println("Enter id");
//			try {
//				id = sc.nextInt();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			rd.removeRepairId(id);
//			break;
//		}
//		
//		case "0":{
//			System.out.println("0 - exit");
//			flag = false;
//			break;
//		}
//		}
//		}
//		
//		
//	}
//
//
//	private void repairsInfoMenu() {
//		System.out.println(" ------------------------------------------------------------ ");
//		System.out.println("1 - add new repair");
//		System.out.println("2 - seach One repair For Id");
//		System.out.println("3 - seach One repair For Name");
//		System.out.println("4 - seach all Repairs");
//		System.out.println("5 - edit One Repair For Name");
//		System.out.println("6 - remove Repair for name");
//		System.out.println("7 - remove Repair for id");
//		System.out.println("0 - exit");
//		System.out.println(" ------------------------------------------------------------ ");
//	}
	
}
