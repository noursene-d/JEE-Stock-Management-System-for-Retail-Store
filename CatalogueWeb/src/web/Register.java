package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.RegisterDao;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String username = request.getParameter("uname");
        String password = request.getParameter("pass");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        
        RegisterDao dao = new RegisterDao();
        
        try {
        	dao.registerUser(username, password, email, firstName, lastName, address);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        response.sendRedirect("Login.jsp");
	}

}
