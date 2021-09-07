package org.cap.demo;

public class SalesClass {
	
	public void show() {
		
		int[] arr= {12,3,4,5,67,67};
		int sum=0;
		
		for(int n:arr) {
			sum+=n;
			System.out.println(n);
		}
		System.out.println("Summation: " + sum);
		
		System.out.println("Sales Class Show method....");
	}

}
