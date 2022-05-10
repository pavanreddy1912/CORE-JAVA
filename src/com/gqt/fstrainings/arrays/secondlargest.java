package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		int fst=arr[0];
		int sec= arr[0];
		System.out.println("Enter the array elements : ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i =0;i<arr.length;i++) {
			if(fst<arr[i]) {
				sec=fst;
				fst=arr[i];
			}
			else {
				if(sec>arr[i]&&arr[i]!=fst) {
					sec=arr[i];
				}
			}
		}
		System.out.println("second largest: "+sec);
	}

}
