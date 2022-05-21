package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class trimleadingwhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		String s2=s1.replaceAll("( )+", " ");
		System.out.println(s2);
	}

}
