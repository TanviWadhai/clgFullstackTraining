package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Getdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/Students";
		
		String user="root";
		String pass="Tanvi02";
		 
		
		//get data 
		String query="select * from phone where id =?";
		
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		
		//create statement 
		PreparedStatement pst=con.prepareStatement(query);  //tight coupling
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter id : ");
		int id=sc.nextInt();
		
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		} 
		
		System.out.println("data get successfully");
		
		//close the statement and connection
		pst.close();
		con.close();
		System.out.println("Connection Closed......");

	}

}
