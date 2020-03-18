package validate.impl;

import domain.User;
import validate.Validation;

public class UserValidation implements Validation{
	
	@Override
	public void validateObject(Object object) throws Exception {
		if(! (object instanceof User)) {
			throw new Exception("Not valid object");
		}
		User user=(User) object;
		if(user.getUsername().isEmpty()) throw new Exception("Username can not be empty");
		if(user.getPassword().isEmpty()) throw new Exception("Password can not be empty");
		
	}

}
