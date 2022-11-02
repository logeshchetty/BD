package com.BDclasses;

public class PrimeNumber {

	public static void main(String[] args) {

		int sum=0;
		for (int i = 2; i <=50; i++) {
			int count=0;

			for (int j = 2; j < i; j++) {
				
				if (i%j==0) {
					count++;
					
				}
				
			}
			if (count==0) {
			System.err.println(sum);

			}	
		}
		System.out.println("Total primenumber"+sum);
	
	}
}
