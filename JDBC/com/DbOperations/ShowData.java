package com.DbOperations;
import java.sql.*;
import com.DbConnection.DbConnection;


public class ShowData {
	
	void showStudent(){
		
		try {
			Connection conn = DbConnection.connect();
			Statement st = conn.createStatement();
			
			String query = "SELECT * FROM student";
			ResultSet rs = st.executeQuery(query);
			
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
