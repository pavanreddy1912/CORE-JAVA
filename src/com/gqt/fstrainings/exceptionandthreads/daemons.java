package com.gqt.fstrainings.exceptionandthreads;

class naveen extends Thread{
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("Naveen")||Thread.currentThread().getName().equals("Harish")) {
				System.out.println(Thread.currentThread().getName()+" is Using bathroom.....");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is out of bathroom.....");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is in sports room with whom ???.....");
				Thread.sleep(3000);
			}
			else  {
				System.out.println(Thread.currentThread().getName()+" is Using bathroom.....");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is out of bathroom.....");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is in hostel room.....");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class daemons {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		naveen dm = new naveen();
		naveen dm1=new naveen();
		naveen dm2 = new naveen();
		
		dm.setName("Naveen");
		dm1.setName("Harish");
		dm2.setName("Pavan");
		
		dm.start();
		dm.join();
		dm1.start();
		dm1.join();
		dm2.start();
	}

}
