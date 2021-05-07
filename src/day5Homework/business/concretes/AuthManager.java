package day5Homework.business.concretes;

import day5Homework.business.abstracts.AuthService;
import day5Homework.business.abstracts.UserService;
import day5Homework.core.abstracts.EmailService;
import day5Homework.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	private EmailService emailService;

	public AuthManager(UserService userService, EmailService emailService) {
		super();
		this.userService = userService;
		this.emailService = emailService;
		
	}

	@Override
	public void register(User user) {
		userService.add(user);
		
	}

	@Override
	public void login(String email, String password) {
		if(userService.login(email, password)) {
			emailService.sendEmail(email);
		}
	}

	@Override
	public void login(User user) {
		if(userService.login( user)) {
			
		}
		
	}

}
