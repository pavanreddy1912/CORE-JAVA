package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class diagonaladd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix size : ");
		int n = sc.nextInt();
		
		int [][] arr=new int[n][n] ;
		int sum = 0;
		System.out.println("Enter the first matrix elements");
		for (int i =0;i<arr.length;i++) {
			System.out.println("enter the "+i+" row elements");
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter the "+j+" row elements");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("sum of the diagonal elements : "+sum);
	}

}
