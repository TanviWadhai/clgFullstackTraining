package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		
		String user="system";
		String pass="Tanvi@123";
		
		String query="create table phone(id NUMBER PRIMARY KEY ,brand VARCHAR(20),price NUMBER)";
		
		// loading the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully.");
		
		//establishing The Connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully");
		
		//create statement 
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query); 
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}

	}

}
