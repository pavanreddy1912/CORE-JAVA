package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class OverageException extends Exception{
	public String getmessage() {
		return "You are overaged person.!!";
	}
}
class UnderageException extends Exception{
	public String getmessage() {
		return "you are Under aged person. !!";
	}
}

class bride {
	int age;
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
	}
	void verify() throws UnderageException,OverageException{
		if(age<18) {
			UnderageException uae = new UnderageException();
			System.out.println(uae.getmessage());
			throw uae;
		}
		else if(age>45) {
			OverageException oae = new OverageException();
			System.out.println(oae.getmessage());
			throw oae;
		}
		else {
			System.out.println("Hey you Blushing aaa you idiot !!");
		}
	}
}

class age{
	void enterage(bride b)  {
		try {
			b.getDetails();
			b.verify();
		}
		catch(OverageException o1){
			System.out.println("you are a senior citizen you are not allowed");
		}
		catch(UnderageException u1) {
			System.out.println("hey you kid get lost : ");
		}
	}
}
public class customException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age a = new age();
		bride b1 = new bride();
		a.enterage(b1);
	}

}
