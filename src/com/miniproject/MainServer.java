package com.miniproject;

import java.sql.SQLIntegrityConstraintViolationException; 
import java.util.Scanner;



public class MainServer {
	
	public static void main(String[]args) {
		System.out.println("********Welcome to Online Examination & Result Portal*********");
		System.out.println("                            ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1 for Exam OR select 2 for Result OR 3 for Result List");
		
		int input =scan.nextInt();
		
		if (input ==1) {
			Exam ex = new Exam();
			try {
				ex.exam();
			} catch (SQLIntegrityConstraintViolationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (input==2) {
			IndividualResult ir = new IndividualResult();
			ir.result();
		}else if (input==3) {
			Sortingresult sr = new Sortingresult();
			sr.resultsort();
		}else {
			System.out.println("Invalid Input");
		}

		
	}

}
