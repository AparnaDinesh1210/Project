package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fujitsu.loginAndRegister.model.User;

public class UserRegistrationDao {
	
	public boolean registerUser(User user)
	{
		System.out.println("Start of UserRegistrationDAO :: registerUser");
		String url = "jdbc:mysql://localhost:3306/advjava";
		String db_username = "root";
		String db_password = "rootpassword";
		
		Connection con;
		PreparedStatement pstmt;
		String sql = "insert into user values(?,?,?,?,?)";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,db_username,db_password);
		    pstmt = con.prepareStatement(sql);
		    
		    pstmt.setInt(1,user.getId());
		    pstmt.setString(2, user.getUsername());
		    pstmt.setString(3, user.getPassword());
		    pstmt.setInt(4, user.getPhone());
		    pstmt.setString(5, user.getAddress());
		    
		    int result = pstmt.executeUpdate();
		    
		    if(result > 0)
		      return true;
		    
		
		} 
		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Start of UserRegistrattionDAO :: registerUser");
		return false;
	}

}
