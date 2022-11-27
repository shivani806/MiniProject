package com.miniproject;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import Driver.DriverCommen;

public class IndividualResult {

	public void result() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your roll Number");
		int roll=scan.nextInt();
		
		DriverCommen dc = new DriverCommen();
		Connection connection =dc.driverload();
		
		try {
		PreparedStatement pps = connection.prepareStatement("select * from project.result where RollNo=?;");
		
		pps.setInt(1, roll);
		
		ResultSet rs = pps.executeQuery(); 
		
		while(rs.next()) {
			
			System.out.println("Student Name : "+rs.getString(1));
			System.out.println("Roll No : "+rs.getInt(2));
			System.out.println("Marks : "+rs.getInt(3));
			System.out.println("Grade : "+rs.getString(4));
		}
		
		}catch(Exception E) {
			E.printStackTrace();
		}
	}
}
