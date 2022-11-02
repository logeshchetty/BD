package com.BDclasses;

public class overRiding {
	
	public  void Name(String name) {
		System.out.println(name);

	}
	
	public  void age(String name,int age) {
		System.out.println(age);

	}
	
	public void rollno(String name,int age,int rollno) {
		
		System.out.println(rollno);

	}
	
	public static void main(String[] args) {
		
		overRiding overRiding = new overRiding();
		
		overRiding.Name("Logesh");
		overRiding.age("Logesh", 25);
		overRiding.rollno("Logesh", 25, 1513066);
		
		
	}

}
