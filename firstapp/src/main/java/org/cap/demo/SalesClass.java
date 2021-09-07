package org.cap.demo;

public class SalesClass {
	int[] arr= {12,34,56,78,78};
	
	
	public void show() {
		
		int[] arr= {12,3,4,5,67,67};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Summation: " + sum);
		
		System.out.println("Sales Class Show method....");
	}

}
