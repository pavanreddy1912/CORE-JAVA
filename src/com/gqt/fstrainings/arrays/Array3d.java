package com.gqt.fstrainings.arrays;

import java.util.Scanner;

/**
 * @author pavan
 *description: demonstration of 1- dimensional array
 *@requirement to store the marks of n students from m classrooms and o colleges
 */
public class Array3d {

	/**
	 * @param args
	 * @param sc
	 * @param m
	 * @param n
	 * @param o
	 * @param arr
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of colleges : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter the number of class rooms per college : ");
		int m = sc.nextInt();
		System.out.println("enter the number of students per classroom : ");
		int o = sc.nextInt();
		
		
		int arr[][][]= new int[n][m][o];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("the count of classes inside the college -"+(i+1)+" is :"+arr[i].length);
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of students from college -"+(i+1)+" class :"+(j+1)+
							" student - "+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("the marks of students from college -"+(i+1)+" class :"+(j+1)+
							" student - "+arr[i][j][k]);
				}
			}
		}
	}

}
