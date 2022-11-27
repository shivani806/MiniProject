package com.miniproject;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import Driver.DriverCommen;



public class Quize {
	
	static int marks=0;
	static int count=1;
	//static int score=0;
	
	
	public void exam() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//getconnection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","shivani806");
			
		
		//Connection con = di.driverload();
			
			DriverCommen di= new DriverCommen();
			Connection connection = di.driverload();
		
		PreparedStatement pps = connection.prepareStatement("select * from project.questions");
		
		ResultSet set = pps.executeQuery();
		System.out.println("****EXAM STARTED***");
		while(set.next()) {
			
			System.out.println(set.getInt(1));
			System.out.println(set.getString(2));
			System.out.println(set.getString(3));
			System.out.println(set.getString(4));
			System.out.println(set.getString(5));
			System.out.println(set.getString(6));
			
			System.out.println("--------------------");
		
              Scanner scan = new Scanner(System.in);
              System.out.println("Enter Answer");
              Object  o = scan.nextLine();
              
              PreparedStatement pps1 = con.prepareStatement("select answers from project.answer where ansNo=?");
              pps1.setInt(1, count); 
             
              //System.out.println(count);
             
              ResultSet rs = pps1.executeQuery();
              while(rs.next()) {
            	  
                  Object ans = rs.getObject(1);
                  count++;
                  //System.out.println(count);
                  //System.out.println(ans);
                 
               if(o.equals(ans)) {
            	  marks++;
            	//System.out.println("ans is correct");  
              }else {
            	  
            	  //System.out.println("ans is wrong");
              }
              }
              System.out.println("******************");
             	
		}
             // System.out.println("Student Marks : "+ marks);
		/*if (marks >=8) {
			System.out.println("Grade A" );
		}else if(marks>=6) {
			System.out.println("Grade B");
		}else if (marks==5){
			System.out.println("Grade C");
		}else if(marks<5){
			System.out.println("Fail");
				
		}*/
		
		}catch(Exception E) {
			E.printStackTrace();
		}finally {
			System.out.println("Thank you...Exam End " );
		}
	}
	
	

}
