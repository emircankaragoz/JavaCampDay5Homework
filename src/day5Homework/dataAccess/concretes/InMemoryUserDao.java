package day5Homework.dataAccess.concretes;

import java.util.List;

import day5Homework.dataAccess.abstracts.UserDao;
import day5Homework.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Memory'e eklendi: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
