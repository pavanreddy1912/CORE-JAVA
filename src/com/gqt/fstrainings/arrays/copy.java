package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		int arr1[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("copied elements");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" "); 
		}
	}

}
