package isetj.servlets;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//travail avec doPost method
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		
		//accepter username et password 
		String userName = request.getParameter("uname"); 
		String passWord = request.getParameter("psw"); 
		
		//base de données
		
		try {
			// ouvrir la connexion 
            Class.forName("com.mysql.jbdc.Driver");
            Connection con = DriverManager.getConnection("jbdc:mysql://3306/mybd?useSSL=false","dsi","dsi"); 
            // user = dsi , password = dsi 
            
            // obternir les données 
            java.sql.Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(
            		
            		"select * from login where username= '"
            		+ userName + "'and password = '"+passWord+"'");
            
            if(rs.next()) {
            	// si l'utilisateur saisit les Login et mot de passe correctes
            	out.println("Authentication réussie");

            	
            }else {
            	
            	// incorrect 
            	
            	out.println("Echéc à l'authentication");
            }
            
            // fermer la connection
            
            con.close();
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		

		
	}

}
