package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class removeupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string that need replacements : ");
		String s1=sc.nextLine();
		String res=" ";
		for(int i=0;i<s1.length();i++) {
			if(!(s1.charAt(i)>=65&&s1.charAt(i)<=90)) {
				res = res+s1.charAt(i);
			}
			
		}
		System.out.println(" The replaced string is : "+res);
	}

}
