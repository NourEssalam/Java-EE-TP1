package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CompteurServlet extends HttpServlet {
      
	 // Declaration 
	 int i = 0;
	 
	 public void init() {
		 
		 i=1; 
	 }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter(); 
		
		out.println("nombre de visit : "+i); 
	
	    i++; 
	}

}
