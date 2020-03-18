package action.implementation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import domain.User;
import validate.Validation;
import validate.impl.UserValidation;


public class LoginAction extends AbstractAction{
	
	private static Validation validator = new UserValidation();

	
	@Override
	public String execute(HttpServletRequest req) {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String page = "../login.jsp";
		
		List<User> users = (List<User>)req.getServletContext().getAttribute("users");
	
		try {
			User user = new User(username,password);
			validator.validateObject(user);
			if(users.contains(user)) {
				HttpSession session = req.getSession(true);
				session.setAttribute("currentUser", user);
				page="WEB-INF/pages/index.jsp";
			}else {
				req.setAttribute("validationError", "User does not exist!");
			}
		
		}catch(Exception e) {
			req.setAttribute("validationError", e.getMessage());
			return page;
		}
			return page;
		}
	
}

