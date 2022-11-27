package com.miniproject;



public class greads {
    String g=null;
	public void marks() {
	Quize q = new Quize();
	q.exam();
	int Marks = q.marks;
	}
	
		public String Grade() { 
			
		String A=null;
			Quize a = new Quize();
			int Marks = a.marks;
			
		if (Marks >=8) {
			 A=  "A";
		}else if(Marks>=6) {
			 A="B";
		}else if (Marks==5){
			 A ="C";
		}else if(Marks<5){
			 A= "FAIL";
		}
		return A;
	   
	}

}
