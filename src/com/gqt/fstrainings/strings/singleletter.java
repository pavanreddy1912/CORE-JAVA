package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class singleletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to print : ");
		String s1=sc.nextLine();
		s1.toCharArray();
		System.out.println("Enter the substring : ");
		String s2 =sc.next();
		for(int i=0;i<s1.length()-s2.length();i++) {
			int j;
			for(j=0;j<s2.length();j++) {
				if(s1.charAt(i+j)!=s2.charAt(j)) {
					break;
				}
			}
			if(j==s2.length()) {
				
			}
		}
	}

}
