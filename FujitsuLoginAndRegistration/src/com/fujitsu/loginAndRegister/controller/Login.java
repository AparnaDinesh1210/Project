package com.fujitsu.loginAndRegister.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fujitsu.loginAndRegister.DAO.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		
		
		
//		if(username.equals("Aparna") && password.equals("password"))
//		{
//		   HttpSession session = request.getSession();
//		   session.setAttribute("user", username);
//		   response.sendRedirect("welcome.jsp");	
//		}
		
		
		LoginDao dao = new LoginDao();
		
		boolean result = dao.verifyUserCredentials(username, password);
		
		if(dao.verifyUserCredentials(username, password))
		{
			System.out.println("Executing if block - " +result);
			
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			response.sendRedirect("welcome.jsp");	
		}
		else
		{
		    response.sendRedirect("login.jsp");
		    System.out.println("Executing else block - " +result);
		}
	}
}
