package com.BDclasses;

public class inheritanceB extends inheritanceA{
	
	public void D() {
		System.out.println("D");

	}
	public static void main(String[] args) {
		
		inheritanceB b = new inheritanceB();
		
		b.A();
		b.B();
		b.C();
		b.D();
	}

}
