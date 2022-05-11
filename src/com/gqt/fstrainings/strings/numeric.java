package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to count the alphabets : ");
		String s1 = sc.nextLine();
		int count =0;
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)>=48&&s1.charAt(i)<=57) {
				count++;
			}
		}
		System.out.println("the alphabets count is : "+count);
	}

}
