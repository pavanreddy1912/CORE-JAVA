package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Enter the array Elements : "+i);
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			else {
				
				System.out.println(arr[i]);
			}
		}
	}

}
