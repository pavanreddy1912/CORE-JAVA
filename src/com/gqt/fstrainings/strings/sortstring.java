package com.gqt.fstrainings.strings;

import java.util.Arrays;
import java.util.Scanner;

public class sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to sort : ");
		String s1 = sc.nextLine();
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
	}

}
