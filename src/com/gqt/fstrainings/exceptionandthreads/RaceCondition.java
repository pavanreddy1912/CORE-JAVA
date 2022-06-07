package com.gqt.fstrainings.exceptionandthreads;

class msoffice extends Thread{
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("Typing")) {
				typing();
			}
			else if(Thread.currentThread().getName().equals("SpellChecking")) {
				SpellChecking();
			}
			else {
				saving();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void saving()throws InterruptedException{
		// TODO Auto-generated method stub
		for(; ;) {
			System.out.println("Saving....");
			Thread.sleep(1000);
		}
	}

	private void SpellChecking() throws InterruptedException{
		// TODO Auto-generated method stub
		for(;;) {
			System.out.println("SpellChecking....");
			Thread.sleep(1000);
		}
		
	}

	private void typing() throws InterruptedException{
		// TODO Auto-generated method stub
		for(int i =0;i<5;i++) {
			System.out.println("Typing....");
			Thread.sleep(1000);
		}
	}
}
public class RaceCondition {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		msoffice ms1=new msoffice();
		msoffice ms2=new msoffice();
		msoffice ms3=new msoffice();
		
		ms1.setName("Typing");
		ms2.setName("SpellChecking");
		ms3.setName("Saving");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms2.setPriority(8);
		ms3.setPriority(9);
		
		ms1.start();
		
		ms2.start();
	
		ms3.start();
	}

}
