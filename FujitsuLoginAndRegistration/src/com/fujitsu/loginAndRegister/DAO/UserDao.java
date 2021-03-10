package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fujitsu.loginAndRegister.model.User;

public class UserDao {
	
	public ResultSet getDetails()
	{
	
		User user;
		
		String url = "jdbc:mysql://localhost:3306/advjava";
		String db_username = "root";
 		String db_password = "rootpassword";
 		
		Connection con;
 		PreparedStatement ps;
 		
 		
 		String sql = "select * from users";
 		

 		try {
 			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,db_username,db_password);
			
			ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
            return rs;	
 		}
			
 		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
 		
	
	}

	
}