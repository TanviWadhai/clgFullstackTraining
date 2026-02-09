package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/Students";
		String user="root";
		String pass="Tanvi02";
		//for create table
//		String sql="create table phone(id int primary key,brand varchar(20),price int)"; 
		//insert values in table
		String sql="insert into phone values (11,'nokia',1200),(12,'samsung',20000),(13,'oppo',13000),(14,'iphone',100000) ";  
		
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		
		//create statement 
		Statement st=con.createStatement();
		int i=st.executeUpdate(sql) ;
		System.out.println(i+ "row affected");
		
	}

}
