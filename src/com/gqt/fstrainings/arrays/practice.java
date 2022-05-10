package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		int count =0;
		int [] arr=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i =0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		System.out.println("the no of non zero elements: "+count);
		
	}

}
