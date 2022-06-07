package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class operations2 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("banking")) {
			bankingb();
		}
		else if(Thread.currentThread().getName().equals("addition")) {
			addition();
		}
		else {
			printing();
		}
	}
	
	public void bankingb() {
		System.out.println("Banking application started ");
		System.out.println("Enter the accno ");
		Scanner sc = new Scanner (System.in);
		int accno = sc.nextInt();
		System.out.println("Enter the pin :");
		int pin = sc.nextInt();
		System.out.println("Banking ops completer");
	}
	
	public void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("addition ops started ");
		System.out.println("Enter the num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();
		int res = num1/ num2 ;
		System.out.println("res= "+res);
	}


	public void printing() {
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
public class multithreadingwithinterruptedexception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("main started ");
		
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		t1.setName("banking");
		t1.setPriority(1);
		
		t2.setName("addition");
		t2.setPriority(2);
		
		t1.setName("printing");
		t1.setPriority(3);
		
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
		t1.start();
		t1.join();
		t2.start();
		t1.join();
		t3.start();
		t1.join();
		
		System.out.println("main terminated");
	}

}
