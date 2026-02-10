package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update_data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/Students";
		
		String user="root";
		String pass="Tanvi02";
		
		//get data 
		String query="update phone set price=500000 where id = 11";
		
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		
		Statement st=con.createStatement();
		int rs=st.executeUpdate(query);  
	
		System.out.println("data get successfully");
		
		//close the statement and connection
		
		con.close();
		System.out.println("Connection Closed......");		

	}

}
