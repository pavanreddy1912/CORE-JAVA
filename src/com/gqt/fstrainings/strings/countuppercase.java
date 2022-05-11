package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class countuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to count upper case letters : ");
		String s1= sc.nextLine();
		int count=0;
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)>=65&&s1.charAt(i)<=90) {
				count++;
			}
		}
		System.out.println("the count of uppercase letters is : "+count);
	}

}
