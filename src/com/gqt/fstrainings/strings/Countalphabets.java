package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class Countalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to count the alphabets : ");
		String s1 = sc.nextLine();
		int count =0;
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)>=65&&s1.charAt(i)<=90||s1.charAt(i)>=97&&s1.charAt(i)<=122) {
				count++;
			}
		}
		System.out.println("the alphabets count is : "+count);
	}

}
