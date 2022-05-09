package com.gqt.fstrainings.strings;

import java.util.Scanner;

class Aadhar{
	String name;
	String father_name;
	long ad_id;
	static String nationality;
	long phno;
	

	
	static {
		nationality="india";
	}
	void take_in() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		name= sc.next();
		System.out.println("Enter the father_name : ");
		father_name= sc.next();
		System.out.println("Enter the Aadhar id : ");
		ad_id= sc.nextLong();
		System.out.println("Enter the phone number : ");
		phno= sc.nextLong();
		
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("father_name : "+father_name);
		System.out.println("Aadhar id : "+ad_id);
		System.out.println("phone number : "+phno);
		System.out.println("country : "+nationality);
	}
	
}

public class Staticexmp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aadhar aa1= new Aadhar();
		aa1.take_in();
		Aadhar aa2= new Aadhar();
		aa2.take_in();
		if(aa1==aa2) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
