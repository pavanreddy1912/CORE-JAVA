package com.gqt.fstrainings.arrays;

import java.util.Scanner;

/**
 * @author pavan
 *
 */
public class Array3 {
	/**
	 * @param args
	 * @param sc
	 * @param m
	 * @param n
	 * @param arr
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of colleges : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][][]= new int[n][][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number of classes ineach college : "+i);
			arr[i]=new int[sc.nextInt()][];
			}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the number of students in each class : ");
				arr[i][j]=new int[sc.nextInt()];
			}
		}
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
