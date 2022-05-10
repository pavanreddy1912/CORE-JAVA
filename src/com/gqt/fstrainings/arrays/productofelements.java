package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class productofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		long pro = 1;
		
		int[] arr=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			pro*=arr[i];
		}
		System.out.println("the product of all elements is : "+pro);
	}

}
