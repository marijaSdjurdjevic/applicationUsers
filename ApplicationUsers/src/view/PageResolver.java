package view;

import java.util.HashMap;
import java.util.Map;

import constants.PageConstants;
import constants.ViewConstants;

public class PageResolver {
	
private Map<String, String> pages;
	
	public PageResolver() {
		pages= new HashMap<String,String>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(ViewConstants.LOGIN, PageConstants.PAGE_LOGIN);
				put(ViewConstants.HOME, PageConstants.PAGE_HOME);
				put(ViewConstants.ADD_USER, PageConstants.PAGE_ADD_USER);
				put(ViewConstants.ALL_USERS, PageConstants.PAGE_ALL_USERS);
			
			}
		};
	}

	public String getPage(String view) {
		if(pages.containsKey(view))	return pages.get(view);
		//return default error page;
		return null;
	}

}
