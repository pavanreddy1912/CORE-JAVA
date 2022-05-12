package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class concatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1=sc.next();
		System.out.println("Enter the second string : ");
		String s2=sc.next();
		
		s1=s1.concat(s2);
		System.out.println(s1);
		
	}

}
