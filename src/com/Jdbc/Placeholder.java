package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Placeholder {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/Students";
		
		String user="root";
		String pass="Tanvi02";
		
		//for create table
//		String query="create table phone(id NUMBER PRIMARY KEY ,brand VARCHAR(20),price NUMBER)";
		
		//insert values in table
		String query="insert into phone values(?,?,?) ";  
		
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		
		//create statement 
		PreparedStatement pst=con.prepareStatement(query);  //tight coupling
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter id ");
		int id=sc.nextInt();
		System.out.println("please enter brand_name: ");
		String brand=sc.next();
		System.out.println("please enter price: ");
		int price=sc.nextInt();
		
		pst.setInt(1, id);
		pst.setString(2, brand);
		pst.setInt(3, price);
		
		pst.executeUpdate();

		System.out.println("data insert successfully");
		
		//close the statement and connection
		pst.close();
		con.close();
		System.out.println("Connection Closed......");

	}

}
