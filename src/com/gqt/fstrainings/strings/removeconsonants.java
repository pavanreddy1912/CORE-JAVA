package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class removeconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to count : ");
		String s1 = sc.nextLine();
		String res="";
		for(int i = 0;i<s1.length();i++) {
			if((s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'
					||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')) {
				res =res + s1.charAt(i);
			}
		}
		System.out.println("the count of consonants : "+res);
	}

}
