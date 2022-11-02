package com.BDclasses;

public class overRiding2 extends overRiding{
	
	@Override
	public void Name(String name) {
		// TODO Auto-generated method stub
		super.Name(name);
	}
	
	@Override
	public void age(String name, int age) {
		// TODO Auto-generated method stub
		super.age(name, age);
	}
	
	@Override
	public void rollno(String name, int age, int rollno) {
		// TODO Auto-generated method stub
		super.rollno(name, age, rollno);
	}
	
	public static void main(String[] args) {
		
		overRiding2 overRiding2 = new overRiding2();
		
		overRiding2.Name("Logesh");
		overRiding2.age("Logesh", 25);
	}
	

}
