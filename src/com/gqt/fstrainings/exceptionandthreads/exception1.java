package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

public class exception1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Arthemetic operation started : ");
			System.out.println("Enterr the num1 to add : ");
			int n = sc.nextInt();
			System.out.println("Enter the second num2: ");
			int m= sc.nextInt();
			int res = n/m;
			System.out.println("res is :"+res);
			
			System.out.println("Array operation started :");
			System.out.println("Enter the size of array");
			int k = sc.nextInt();
			int[] arr=new int[k];
			System.out.println("Enter the array position :");
			int z= sc.nextInt();
			System.out.println("Enter the value to insert in the position:");
			int val = sc.nextInt();
			arr[z]=val;
			System.out.println("Array ops completed.");
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("Divide by zero error ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Check the position ");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
		}

	}

}
