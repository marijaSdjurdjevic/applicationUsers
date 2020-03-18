package action.factory;

import action.AbstractAction;
import action.implementation.HomeAction;
import action.implementation.LoginAction;
import action.implementation.LogoutAction;
import action.implementation.UserAddAction;
import action.implementation.UserAllAction;
import action.implementation.UserOnSystemAction;


public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action =null;
		
		if(actionName.equalsIgnoreCase("/login")) {
			action = new LoginAction();
		}
		
		if(actionName.equalsIgnoreCase("/logout")) {
			action = new LogoutAction();
		}
		
		if(actionName.equalsIgnoreCase("/home")) {
			action = new HomeAction();
		}
		
		if(actionName.equalsIgnoreCase("/users/add")) {
			action = new UserAddAction();
		}
		
		if(actionName.equalsIgnoreCase("/users/all")) {
			action = new UserAllAction();
		}
		if(actionName.equalsIgnoreCase("/users/userOnSystem")) {
			action = new UserOnSystemAction();
		}
		
		
		return action;
	}

}
