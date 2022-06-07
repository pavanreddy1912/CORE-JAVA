package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class sortarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		int i=0,j=0,k=0;
//		System.out.println("Enter the array size");
//		int n=sc.nextInt();
//		System.out.println("Enter the first arry to merge : ");
		int[] arr= {3,5,9,12,15};
//		for(i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//			System.out.println(arr[i]);
//		}
//		System.out.println("Enter the 2nd array size");
//		int m=sc.nextInt();
//		System.out.println("Enter the second arry to merge : ");
		int[] arr1= {1,6,8};
//		for(i=0;i<arr1.length;i++) {
//			arr1[i]=sc.nextInt();
//			System.out.println(arr1[i]);
//		}
		int res[]=new int[arr.length+arr1.length];
		
		while(i<arr.length&&j<arr1.length) {
			if(arr[i]<arr1[j]) {
				res[k]=arr[i];
				i++;
				k++;
			}
			else {
				res[k]=arr1[j];
				j++;
				k++;
			}
		}
		while(i<arr.length) {
			res[k]=arr[i];
			i++;
			k++;
		}
		while(j<arr1.length) {
			res[k]=arr1[j];
			j++;
			k++;
		}
		for(i=0;i<res.length;i++) {
			System.out.println(res[i]+" ");
		}
	}

}
