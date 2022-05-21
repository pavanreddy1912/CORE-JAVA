package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class trimwhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s1=sc.next();
		s1.trim();
		
		System.out.println(s1);
	}

}
