package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addBatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/Students";
		String user="root";
		String pass="Tanvi02"; 
		
		//insert values in table
		String sql="insert into phone values (31,'lava',1000)"; 
		String sql1="insert into phone values (45,'realmi',187400)"; 
		String sql2="insert into phone values (93,'nothing',1521000)"; 
		
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		
		//create statement 
		Statement st=con.createStatement();
		st.addBatch(sql);
		st.addBatch(sql1);
		st.addBatch(sql2);
		
		st.executeBatch();
		System.out.println("Data added successfully");

	}

}
