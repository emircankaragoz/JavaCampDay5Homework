package day5Homework;

import day5Homework.business.abstracts.AuthService;
import day5Homework.business.concretes.AuthManager;
import day5Homework.business.concretes.UserManager;
import day5Homework.core.concretes.HostingEmailManager;
import day5Homework.core.concretes.UserCheckManager;
import day5Homework.dataAccess.concretes.InMemoryUserDao;
import day5Homework.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setFirstName("Emircan");
		user1.setLastName("Karagöz");
		user1.setEmail("emircan.krgz@gmail.com");
		user1.setPassword("1234567890");
	

		
		AuthService authService = new AuthManager(new UserManager(new UserCheckManager(), new InMemoryUserDao()), new HostingEmailManager());
		User user2 = new User(2, "Emircan", "Karagöz", "emircan@gmail.com", "1234562");
		
		authService.register(user2);
		
		authService.login(user1.getEmail(),user1.getPassword());
		
		authService.login(user1);
		
		//authService.login(user1.getEmail(), user1.getPassword());
		
	}

}
