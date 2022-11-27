package com.miniproject;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;
import Driver.DriverCommen;

//import com.project.main.Quize;

public class Exam {

	public static void exam() throws SQLIntegrityConstraintViolationException {
		
		
		System.out.println("-----------JAVA QUIZE-----------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println("Enter Your Roll No");
		int no =scan.nextInt();
		
		Quize q = new Quize();
		q.exam();
		int Marks = q.marks;
		
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "shivani806");
		
		DriverCommen di= new DriverCommen();
		Connection connection = di.driverload();
		
		PreparedStatement pps = connection.prepareStatement("insert into project.result values(?,?,?,?);");
		
		greads gr = new greads();
		String N =gr.Grade();
		pps.setString(1,name);
		pps.setInt(2, no);
		pps.setInt(3,Marks);
		pps.setString(4, N);
		
		int a = pps.executeUpdate();
		
		}catch(Exception E) {
			E.printStackTrace();
		}
		
		
}
}


