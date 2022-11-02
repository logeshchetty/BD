package com.BDclasses;

public class OddEven {
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {2,3,56,65,78,43,44,50,25,79,78,90}; 
		
		int oddCount=0,evenCount=0;
		
		for (int i : arr) {
			
			//System.out.println(i);
			
			if (i%2==0)
			{
				evenCount++;
				
			} else {
				oddCount++;

			}
			
		}
		
		System.out.println("OddCount"+oddCount);
		System.out.println("EvenCount"+evenCount);
		
		
		
		
	
	}

}
