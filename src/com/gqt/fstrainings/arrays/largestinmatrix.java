package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class largestinmatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix size : ");
		int n = sc.nextInt();
		
		int [][] arr=new int[n][n] ;
		int lar = arr[0][0];
		System.out.println("Enter the matrix elements");
		for (int i =0;i<arr.length;i++) {
			System.out.println("enter the "+i+" row elements");
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter the "+j+" row elements");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i =0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(lar<arr[i][j]) {
					lar = arr[i][j];
				}
			}
		}
		System.out.println("Largest number : "+lar);
	}
}
