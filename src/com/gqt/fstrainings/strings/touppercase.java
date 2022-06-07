package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class touppercase {
	public static String convert(String s) {
		String t ="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=96&&s.charAt(i)<=122) {
				t=t+(char)(s.charAt(i)-32);
			}
			else {
				t=t+s.charAt(i);
			}
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to convert");
		String s1 = sc.nextLine();
		String s2=s1.toUpperCase();
		System.out.println(s2);
	}

}
