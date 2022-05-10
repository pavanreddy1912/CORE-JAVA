package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		int arr1[] = new int[n];
		int[] arr3 = new int[n+n];
		System.out.println("Enter the first array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the second array elements : ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arr3[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			arr3[n+i]=arr1[i];
		}
		System.out.println("Merged array : ");
		for(int i=0;i<arr3.length;i++) {
			
			System.out.print(arr3[i]+" ");
		}
		
	}

}