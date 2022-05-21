package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class pangram {
	public static void check(String str) {
		str.toLowerCase();
		boolean res=true;
		for(char i='a';i<='z';i++) {
			if(!str.contains(String.valueOf(i))) {
				res=false;
				break;
			}	
		}
		if(res) {
			System.out.println("is a pangram");
		}
		else {
			System.out.println("is not a pangram");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check alphabets : ");
		String s1=sc.nextLine();
		check(s1);
		
		}
		
	}
