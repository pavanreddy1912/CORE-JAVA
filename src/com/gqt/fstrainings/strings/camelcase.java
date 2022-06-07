package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class camelcase {
	public static int camel(String s) {
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		int res = camel(s1);
		System.out.println(res);
	}

}
