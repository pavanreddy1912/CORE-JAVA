package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class devuandfriends {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp=0;
		for(int i =0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int count=0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
