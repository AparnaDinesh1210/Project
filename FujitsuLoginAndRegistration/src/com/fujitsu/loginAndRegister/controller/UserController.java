package com.fujitsu.loginAndRegister.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fujitsu.loginAndRegister.DAO.UserDao;
import com.fujitsu.loginAndRegister.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao dao = new UserDao();
		User user;
		
		ResultSet rs = dao.getDetails();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		ArrayList<User> users = new ArrayList<User>();
		
		try
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				user = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
	            users.add(user);		
			}
			
			request.setAttribute("user", users);
			response.sendRedirect("admin.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}

	
}
