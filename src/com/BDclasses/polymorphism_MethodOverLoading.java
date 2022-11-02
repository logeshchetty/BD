package com.BDclasses;

public class polymorphism_MethodOverLoading{
	
	public void student(String name) {
		System.out.println(name);
		
	}
	
	public void student(String name, int age) {
		System.out.println(name+" "+age);

	}
	
	public void student(int rollno,String name,int age) {
		
		System.out.println(rollno+""+name+""+age);
	}
	
	public static void main(String[] args) {
		
		polymorphism_MethodOverLoading m = new polymorphism_MethodOverLoading();
		m.student("Logesh");
		m.student("Logesh",25);
		m.student(1513066,"Logesh",25);
	}

}
