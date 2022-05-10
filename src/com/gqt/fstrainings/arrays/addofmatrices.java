package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class addofmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix size : ");
		int n = sc.nextInt();
		
		int [][] arr=new int[n][n] ;
		int [][] arr1=new int[n][n] ;
		int [][] res=new int[arr.length][arr1.length];
		
		System.out.println("Enter the first matrix elements");
		for (int i =0;i<arr.length;i++) {
			System.out.println("enter the "+i+" row elements");
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter the "+j+" row elements");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the first matrix elements");
		for (int i =0;i<arr1.length;i++) {
			System.out.println("enter the "+i+" row elements");
			for(int j=0;j<arr1.length;j++) {
				System.out.println("enter the "+j+" row elements");
				arr1[i][j]=sc.nextInt();
			}
		}
		for (int i =0;i<res.length;i++) {
			for(int j=0;j<res.length;j++) {
				res[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		for (int i =0;i<res.length;i++) {
			for(int j=0;j<res.length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
