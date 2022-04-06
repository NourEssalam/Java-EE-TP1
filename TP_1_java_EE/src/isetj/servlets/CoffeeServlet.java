package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 	

public class CoffeeServlet extends HttpServlet 
{
     public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	 
    	 String getOption = req.getParameter("option");
    	 
    	 PrintWriter out = res.getWriter();
    	 out.println("Merci de nous avoir fait parvenir la remarque suivante concernant "+getOption);
    	 
     }
}
