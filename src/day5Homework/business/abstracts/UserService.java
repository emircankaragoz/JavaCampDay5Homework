package day5Homework.business.abstracts;

import java.util.List;

import day5Homework.entities.concretes.User;


public interface UserService {
	void add(User user);
	List<User> getAll();
	boolean login(String email, String password);
	boolean login(User user);
}