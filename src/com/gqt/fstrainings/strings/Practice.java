package com.gqt.fstrainings.strings;

import java.util.Scanner;

class details{
	String name;
	int age;
	String gender;
	/**
	 * @param name
	 * @param age
	 * @param gender
	 */
	public details(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
}
public class Practice {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details d = new details("banu",20,"male");
		details d1=new details("banu",20,"male");
		
		if(d.equals(d1)==true) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equall");
		}
	}

}
