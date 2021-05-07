package day5Homework.core.concretes;

import day5Homework.core.abstracts.EmailService;

public class HostingEmailManager implements EmailService {

	@Override
	public void sendEmail(String email) {
		System.out.println(email + " adresine email doðrulama kodnuz gönderildi.");
		
	}

}
