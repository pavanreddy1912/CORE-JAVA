package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class countchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to print : ");
		String s1=sc.next();
		s1.toCharArray();
		int count=0;
		for(int i =0;i<s1.length();i++) {
			count=count+1;
		}
		System.out.println(count);
	}

}
