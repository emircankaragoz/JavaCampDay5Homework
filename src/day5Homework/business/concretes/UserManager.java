package day5Homework.business.concretes;

import java.util.List;


import day5Homework.business.abstracts.UserService;
import day5Homework.core.abstracts.UserCheckService;
import day5Homework.core.concretes.EmailValidator;
import day5Homework.dataAccess.abstracts.UserDao;
import day5Homework.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	private UserDao userDao;


	
	public UserManager(UserCheckService userCheckService, UserDao userDao) {
		 this.userCheckService = userCheckService;
		 this.userDao = userDao;
	
	}
	
	@Override
	public void add(User user) {
		
		if(userCheckService.CheckIfUnqieEmail(user.getEmail()) == false) {
			System.out.println("Bu email daha �nce kullan�lm��");
		}else if(user.getPassword().length() < 6 || EmailValidator.isEmailValid(user.getEmail()) == false) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r!");
			System.out.println("Emailinizi do�ru girdi�inizden emin olunuz!");
		}else {
			
			if(user.getFirstName().length() <= 2 || user.getLastName().length() < 2) {
				System.out.println("�sminiz ve Soyisminiz 2 karakterden daha uzun olmal�d�r!");
			}else {
				System.out.println("Kullan�c� eklendi: " + user.getFirstName() + " " + user.getLastName());
				userDao.add(user);
			}
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String email, String password) {
		
		System.out.println("***Giri� Paneli***");
		

		if (email == "emircan.krgz@gmail.com" && password == "1234567890") {
			System.out.println("Kullan�c� giri�i ba�ar�l�!");
			return true;
		}else {
			System.out.println("Kullan�c� giri�i ba�ar�s�z!");
			return false;
		}
	}

	@Override
	public boolean login(User user) {
		System.out.println("google ile giri� yap�ld�: " + user.getFirstName());
		return false;
	}




}
