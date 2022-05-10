package com.gqt.fstrainings.arrays;

import java.util.Scanner;

/**
 * @author pavan
 * description: demonstration of 1- dimensional array
 * @requirement to store the marks of n students 
 */
public class Array1d {

	/**
	 * @param args
	 * @param sc
	 * @param n
	 * @param arr
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of students : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Array is ready to go ");
		System.out.println("the length of the given arrayis :"+arr.length);
		//the code to collect and store marks of n students
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the marks of student :"+(i+1));
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" the marks of student  "+(i+1)+" is  :"+arr[i]);
		}

	}

}
