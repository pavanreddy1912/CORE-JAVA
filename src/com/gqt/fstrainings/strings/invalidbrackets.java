package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class invalidbrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check :");
		String s1 = sc.next();
		int bracket=0;
		int count=0;

		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			
			if(c=='(') {
				bracket++;
			}
			else {
				if(bracket<=0) {
					count++;
				}
				else {
					bracket--;
				}
			}
		}
		System.out.println(count+bracket);

	}

}
