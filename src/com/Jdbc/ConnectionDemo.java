package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		String url="jdbc:mysql://localhost:3306/Students";
		String url1="oracle:jdbc:thin:@localhost:1521:xe";
		
		String user="root";
		String pass="Tanvi02";
		
		String sql="select * from student";
		// download jar file->build path-> 
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		
		//create statement 
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql); 
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}

}
