package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter the array elements ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element K : ");
		int k= sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i]) {
				System.out.println("element found at "+(i+1));
				continue;
			}
		System.out.println("element not found");	
			
		}
	}

}
