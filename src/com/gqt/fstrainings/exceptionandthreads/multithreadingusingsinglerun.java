package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class operations1 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("addition")) {
			addition();
		}
		else {
			printing();
		}
	}
	
	public void banking() {
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
public class multithreadingusingsinglerun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started ");
		operations1 t1=new operations1();
		operations1 t2=new operations1();
		operations1 t3=new operations1();
		
		
		
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
		t2.start();
		t3.start();
	}

}
