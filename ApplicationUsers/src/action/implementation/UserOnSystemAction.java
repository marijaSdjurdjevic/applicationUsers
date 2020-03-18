package action.implementation;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import service.UserService;
import service.implementation.UserServiceImpl;

public class UserOnSystemAction extends AbstractAction{
	
private UserService userService;
	
	public UserOnSystemAction() {
		userService = new UserServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request) {
		request.getSession().invalidate();
		return ViewConstants.USER_ON_SYSTEM;
	}

}
