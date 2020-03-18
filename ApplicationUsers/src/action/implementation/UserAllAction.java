package action.implementation;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import service.UserService;
import service.implementation.UserServiceImpl;

public class UserAllAction extends AbstractAction{
	
	private UserService userService;
	
	public UserAllAction() {
		userService = new UserServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request) {
		request.setAttribute("users", userService.getAll());
		return ViewConstants.ALL_USERS;
	}

}
