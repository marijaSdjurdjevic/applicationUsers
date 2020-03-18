package service;

import java.util.List;

import domain.User;

public interface UserService {
	
void save(User user) throws Exception;
	
	List<User> getAll();

}
