package service.implementation;

import java.util.List;

import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService{
	
	private final UserService userService;
	
	public UserServiceImpl() {
		userService = new UserServiceImpl();
	}

	@Override
	public void save(User user) throws Exception {
		if(user.getUsername()==null) throw new Exception("Please enter username!");
		if(user.getPassword()==null) throw new Exception("Please enter password!");
		
		userService.save(user);
	}

	@Override
	public List<User> getAll() {
		return userService.getAll();
	}

}
