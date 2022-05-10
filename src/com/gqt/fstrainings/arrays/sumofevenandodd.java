package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class sumofevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int ec=0;
		int oc=0;
		
		int arr[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				ec+=arr[i];	
			}
			else {
				oc+=arr[i];
				
			}
		}
		System.out.println("sum of even:"+ec);
		System.out.println("sum of odd : "+oc);
	}

}
