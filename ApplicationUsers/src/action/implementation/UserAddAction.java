package action.implementation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;
import service.UserService;
import service.implementation.UserServiceImpl;

public class UserAddAction extends AbstractAction{
	
	private final UserService userService;
	
	public UserAddAction() {
		userService = new UserServiceImpl();
	}
	
	@Override
	public String execute(HttpServletRequest request) {
		
		if(request.getMethod().equalsIgnoreCase("post")) {
			

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);
		
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		users.add(user);
		request.getServletContext().setAttribute("users", users);
		
		return ViewConstants.ADD_USER;

		}
		return ViewConstants.ADD_USER;
	}
}


