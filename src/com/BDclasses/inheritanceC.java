package com.BDclasses;

public class inheritanceC extends inheritanceA{
	
	public void E() {
		System.out.println("E");

	}
	
	public static void main(String[] args) {
		
		inheritanceC c = new inheritanceC();
		
		c.A();
		c.B();
		c.C();
		c.E();
	}

}
