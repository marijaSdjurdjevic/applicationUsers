package action.implementation;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;

public class LogoutAction extends AbstractAction{
	
	
	@Override
	public String execute(HttpServletRequest req) {
		req.getSession().invalidate();
		return ViewConstants.LOGIN;
	}
	
}
