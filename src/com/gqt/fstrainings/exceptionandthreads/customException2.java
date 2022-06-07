package com.gqt.fstrainings.exceptionandthreads;

import java.util.Scanner;

class InvalidcustomerException extends Exception{
	public String getmessage() {
		return "Invalid Credentials . Please Try again!!";
	}
}
class user{
	int acc_main=111;
	int pwd_main=222;
	
	int acc;
	int pwd;
	
	void Getdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the acc no: ");
		acc=sc.nextInt();
		System.out.println("Enter the password: ");
		pwd=sc.nextInt();
		
	}
	void verify() throws InvalidcustomerException{
		
		if(acc==acc_main&&pwd==pwd_main) {
			System.out.println("User Validated . ");
		}
		else {
			InvalidcustomerException ice = new InvalidcustomerException();
			System.out.println(ice.getmessage());
			throw ice;
		}
	}
}


class bank{
	void atmops(user u) {
		try {
			u.Getdetails();
			u.verify();
		}
		catch(InvalidcustomerException e1){
			try {
				u.Getdetails();
				u.verify();
			}
			catch(InvalidcustomerException e2) {
				try {
					u.Getdetails();
					u.verify();
				}
				catch(InvalidcustomerException e3) {
					System.out.println("User Blocked . ");
				}
			}
		}
	}
}
public class customException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b = new bank();
		user u1 = new user();
		b.atmops(u1);
		
	}

}
