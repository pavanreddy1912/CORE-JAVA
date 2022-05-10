package com.gqt.fstrainings.arrays;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pavan
 *description: demonstration of 1- dimensional array
 *@requirement to store the marks of n students from m classrooms from o colleges and p universities
 */
public class Array4d {

	/**
	 * @param args
	 * @param sc
	 * @param m
	 * @param n
	 * @param o
	 * @param o
	 * @param arr
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of universities : ");
		int m=sc.nextInt();
		
		int arr[][][][]=new int[m][][][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the no of colleges for university : "+i);
			arr[i]=new int[sc.nextInt()][][];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the no of class rooms per "
						+ "college : "+j+" in the university :"+i);
				arr[i][j]= new int[sc.nextInt()][];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the no of students per class rooms "+k
							+ "college : "+j+" in the university :"+i);
					arr[i][j][k]=new int[sc.nextInt()];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("-----------------------------------------");
			System.out.println("University number : "+(i+1) );
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("college number : "+(j+1) );
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("class  number : "+(k+1) );
					for(int l=0;l <arr[i][j][k].length; l++) {
						System.out.println("Enter the marks of the student : "+(l+1) );
						arr[i][j][k][l]=sc.nextInt();
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("-----------------------------------------");
			System.out.println("University number : "+(i+1) );
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("college number : "+(j+1) );
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("class  number : "+(k+1) );
					for(int l=0;l <arr[i][j][k].length; l++) {
						System.out.println("the marks of the student : "+arr[i][j][k][l] );
						
					}
				}
			}
		}
	
	}

}
