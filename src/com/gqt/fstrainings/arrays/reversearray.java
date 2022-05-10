package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		int arr1[]=new int[n];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println("reversed elements : "+arr1[i]+" ");
		}
	}

}
