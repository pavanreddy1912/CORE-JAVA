package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class marsexploration {
	public static int mars(String s) {
		int count=0;
		for(int i=0;i<s.length();i=i+3) {
			if(s.charAt(i)!='s') {
				count++;
			}
			if(s.charAt(i+1)!='o') {
				count++;
			}
			if(s.charAt(i+2)!='s') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sos string : ");
		String s1 = sc.nextLine();
		s1.toLowerCase();
		int res = mars(s1);
		System.out.println(res);
	}

}
