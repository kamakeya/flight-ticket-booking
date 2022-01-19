package com.stech.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.stech.DAOI.UserDAOI;
import com.stech.jdbc.DBConnection;
import com.stech.vo.User;

public class userDAO implements UserDAOI {

	public User findUser(String accessCode) {		
		String sqlSelectQuery = "select * from admin-login where access-code =?";
		Connection con;
		try {
			con = DBConnection.connectDB();
			PreparedStatement stmt = con.prepareStatement(sqlSelectQuery);
			stmt.setString(1, accessCode);
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				System.out.println("User Exist");
			}else{
				System.out.println("No User Found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
	