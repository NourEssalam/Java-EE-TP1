package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String text = request.getParameter("yourSearch"); 
		 String engineOpt = request.getParameter("engine"); 
		 
		
		 /*PrintWriter show = response.getWriter();  
		 show.println(text); 
		 
		 PrintWriter choosen = response.getWriter();  
		 choosen.println(engineOpt); */
		 
		 response.sendRedirect(engineOpt+text);
		 
		
		   
		   
		 
	}

	
}
