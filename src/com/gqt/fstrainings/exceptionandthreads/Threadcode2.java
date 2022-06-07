package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class banking{
	void bank() {
		System.out.println("Banking activity : ");
		System.out.println("Enter the acc_no:");
		Scanner sc = new Scanner(System.in);
		int accno=sc.nextInt();
		System.out.println("Enter the pin :");
		int pin =sc.nextInt();
		System.out.println("Banking activity completed.!!");
	}
}
class add{
	void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition activity started ");
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 ");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println("res = "+res);
		System.out.println("Addition operation completed ");
	}
}
class Printing {
	void printing() throws Exception {
		
		System.out.println("Printing activity ");
		for(int i=0;i<5;i++) {
			System.out.println("Hello good morning ");
			Thread.sleep(2000);
		}
		System.out.println("printing completed ");
	
			
		}
}
public class Threadcode2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		banking b = new banking();
		Printing p = new Printing();
		add a = new add();
		b.bank();
		a.addition();
		p.printing();
	}

}
