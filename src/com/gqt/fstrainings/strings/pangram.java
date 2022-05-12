package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check alphabets : ");
		String s1=sc.nextLine();
		boolean b = pangram1(s1);
		if(b==true) {
			System.out.println("it is pangram");
		}
		else {
			System.out.println("not a pangram");
		}
			
		}

	private static boolean pangram1(String s1) {
		if((s1.length())<26) {
			return false;
		}
		else {
			for(int i =0;i<s1.length();i++) {
				if(s1.indexOf(i)<0) {
					return false;
				}
			}
		}
		return true;
		
	
	}

}
