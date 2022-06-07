package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class reverse_certain_length_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Wnter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of the substring : ");
		int k = sc.nextInt();
		for(int i =0;i<arr.length;i=i+k) {
			int l = i;
			int r = Math.min(i+k-1, arr.length-1);
			while(i<r) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				l++;
				r--;
			}	

		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
