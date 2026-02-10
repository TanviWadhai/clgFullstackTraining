package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateWithPrepared {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
String url="jdbc:mysql://localhost:3306/Students";
		
		String user="root";
		String pass="Tanvi02";
		
		//get data 
		String query="update phone set price=? where id = ?";
		
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
  
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter price: ");
		int price=sc.nextInt();
		System.out.println("please enter id ");
		int id=sc.nextInt();
		
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,price);
		pst.setInt(2, id);
		
		int rs=pst.executeUpdate();
		if(rs>0) {
			System.out.println("brand update successfully.");
		}else {
			System.out.println("no record found with id "+ id);
		}
		
		//close the statement and connection
		pst.close();
		con.close();
		System.out.println("Connection Closed......");
	}

}
