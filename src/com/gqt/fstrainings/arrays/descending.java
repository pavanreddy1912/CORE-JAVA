package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		int temp;
		System.out.println("Enter the Array Elements : ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
