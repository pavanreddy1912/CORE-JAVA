package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix size : ");
		int n = sc.nextInt();
		
		int [][] arr=new int[n][n] ;
		int [][] arr1=new int[n][n] ;
		
		System.out.println("Enter the matrix elements");
		for (int i =0;i<arr.length;i++) {
			System.out.println("enter the "+i+" row elements");
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter the "+j+" row elements");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr1[i][j]=arr[j][i];
			}
		}
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
