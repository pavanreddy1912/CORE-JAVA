package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class bankingg implements Runnable{
	@Override
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

class addition1 implements Runnable{
	@Override
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
class print1 implements Runnable{
	@Override
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
public class multithreadingusing_runnable_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started ");
		bankingg b = new bankingg();
		addition1 a = new addition1();
		print1 p = new print1();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(p);
		
		t1.setName("banking");
		t1.setPriority(1);
		
		t2.setName("addition");
		t2.setPriority(2);
		
		t1.setName("printing");
		t1.setPriority(3);
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(p);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
