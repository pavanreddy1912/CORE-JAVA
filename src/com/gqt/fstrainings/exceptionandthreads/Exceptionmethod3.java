package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class Operations{
	void ops() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("arithmetic operation starts :");
			System.out.println("Enter num1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2 =sc.nextInt();
			int res = num1/num2;
			System.out.println("res = "+res);
			System.out.println("Arithmetic Operation ends . ");
			System.out.println("Array operation starts :");
			System.out.println("Enter the array size: ");
			int size = sc.nextInt();
			System.out.println("Enter the position : ");
			int pos = sc.nextInt();
			System.out.println("Enter the value :");
			int val = sc.nextInt();
			int arr[] = new int[size];
			arr[pos]= val;
			System.out.println("Array operation completdd");
			
		}
		catch(ArithmeticException e) {
			System.out.println("main handled the Arithmetic exception ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Check the position . ");
		}
	}
}
public class Exceptionmethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op = new Operations();
		op.ops();
	}

}
