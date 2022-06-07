package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class banking1 extends Thread {
	public void run() {
		System.out.println("Banking application started ");
		System.out.println("Enter the accno ");
		Scanner sc = new Scanner (System.in);
		int accno = sc.nextInt();
		System.out.println("Enter the pin :");
		int pin = sc.nextInt();
		System.out.println("Banking ops completer");
	}
}
class addition extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("addition ops started ");
		System.out.println("Enter the num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();
		int res = num1/ num2 ;
		System.out.println("res= "+res);
	}
}
class print extends Thread{
	public void run() {
		try {
			System.out.println("Printing Activity :");
			for(int i =0;i<5;i++) {
				System.out.println(" Hello good Morning !!");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		banking1 b = new banking1();
		print p = new print();
		addition a = new addition();
		
		b.setName("Banking ");
		b.setPriority(1);
		
		a.setName("addition");
		a.setPriority(2);
		
		p.setName("printing ");
		p.setPriority(3);
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(p);
		
		b.start();
		a.start();
		p.start();
		
	}

}
