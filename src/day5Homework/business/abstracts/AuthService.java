package day5Homework.business.abstracts;

import day5Homework.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(String email, String password);
	void login(User user);
}
