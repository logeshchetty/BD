package com.BDclasses;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class GettingValues {
	
	public static void main(String[] args) {
		
		Integer arr[]= {10,20,25,35,40,10,25};
		
		System.out.println(arr[3]);
		
		
		for (Integer a : arr) {
			
			System.out.println(a);

		}
		
	List<Integer> l = Arrays.asList(arr);
	
	System.out.println(l);
	
	Set<Integer> s = new HashSet<Integer>(l);
	System.out.println(s);
	
		
	}

}
