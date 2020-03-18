package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ApplicationController;
import view.PageResolver;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/Application")
public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ApplicationController applicationController;
	private PageResolver pageResolver;

	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		System.out.println("===========================FrontController================================");
		
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
		System.out.println("===========================FrontController================================");
		
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = applicationController.processRequest(request.getPathInfo(), request);
		System.out.println("view: "+view);
		String page = pageResolver.getPage(view);
		System.out.println("page: "+page);
		request.getRequestDispatcher(page).forward(request, response);
	}

	@Override
	public void init() throws ServletException {

		super.init();
		applicationController = new ApplicationController();
		System.out.println("Application Controller created");
		
		pageResolver = new PageResolver();
		
	}

}
