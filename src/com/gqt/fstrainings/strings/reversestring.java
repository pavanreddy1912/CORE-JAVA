package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to print : ");
		String s1=sc.next();
		String s2=" ";
		s2.toCharArray();
		s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		
	}

}
