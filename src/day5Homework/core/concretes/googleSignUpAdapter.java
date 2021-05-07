package day5Homework.core.concretes;

import day5Homework.core.abstracts.GoogleSingUpService;
import day5Homework.gooleSignUp.googleSignUpManager;

public class googleSignUpAdapter implements GoogleSingUpService{

	@Override
	public void signWithGoogle(String message) {
		googleSignUpManager manager = new googleSignUpManager();
		manager.login(message);
		
	}

}
