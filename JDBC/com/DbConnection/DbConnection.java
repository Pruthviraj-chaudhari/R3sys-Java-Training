package com.DbConnection;
import java.util.*;
import java.sql.*;

public class DbConnection {
	
	public static Connection connect(){
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/r3sys", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
