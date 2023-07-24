package com.DbOperations;

import java.sql.*;
import com.DbConnection.DbConnection;

public class ShowDataPrepareStatement {
	
	void showStudent(){
		Connection conn = DbConnection.connect();
		try {
			
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM student");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("City: " + rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
