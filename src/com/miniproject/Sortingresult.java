package com.miniproject;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Driver.DriverCommen;

public class Sortingresult {
	
	public void resultsort() {
		
		try {
            //  Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getconnection
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12344");
		
		DriverCommen di= new DriverCommen();
		Connection connection = di.driverload();
	  
		Statement state= connection.createStatement();
		
		String query =("select * from project.result order by StudentName asc;");
		
		ResultSet rs = state.executeQuery(query);
		
		while(rs.next()) {
			
			System.out.println("Student Name : "+rs.getString(1));
			System.out.println("Student Roll Number : "+rs.getString(2));
			System.out.println("Student Marks : "+rs.getInt(3));
			System.out.println("Student Grade : "+rs.getString(4));
			
			System.out.println("*******************");
	
		}
		
		}catch (Exception E) {
		E.printStackTrace();
	}

}
	
}
