package action.implementation;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class HomeAction extends AbstractAction{
	
	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "/WEB-INF/pages/index.jsp";
	}


}
