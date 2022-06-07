package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

public class Exceptionexmp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("arithmetic ops begin");
				System.out.println("Enter the num : ");
				int num1 = sc.nextInt();
				System.out.println("Enter the num2 :");
				int num2 = sc.nextInt();
				int res = num1/num2;
				System.out.println("res = "+res);
				System.out.println("arithmetic operations completed ");
			}
			catch(ArithmeticException e) {
				System.out.println("Divide by Zero not possible ");
			}
			try {
				System.out.println("array operation started : ");
				System.out.println("Enter the array size : ");
				int size = sc.nextInt();
				System.out.println("Enter the position to insert the value : ");
				int pos = sc.nextInt();
				System.out.println("Enter the value to be inserted : ");
				int val = sc.nextInt();
				int arr[] = new int[size];
				arr[pos]=val;
				System.out.println("Array ops completed");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("check the position value ");
			}
		}
		catch(Exception e) {
			System.out.println("Exception handled ");
		}
	}

}
