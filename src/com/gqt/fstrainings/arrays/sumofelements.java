package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class sumofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int sum = 0;
		
		int arr[]=new int[n];	
		System.out.println("Enter the array elements : ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("the sum of the array elements : "+sum);
	}

}
