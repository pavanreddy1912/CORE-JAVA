package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class largestindexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		int lar=arr[0];
		System.out.println("Enter the largest element : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(lar<arr[i]) {
				lar=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(lar==arr[i]) {
				System.out.println("Element found at : "+(i+1));
			}
		}
		
	}

}
