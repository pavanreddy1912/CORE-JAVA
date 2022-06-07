package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class countofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		int count=0;
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("number of words is : "+(count+1));
	}

}
