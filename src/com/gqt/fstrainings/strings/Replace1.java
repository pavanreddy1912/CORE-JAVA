package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class Replace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1= sc.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='A') {
				s2=s2+'1';
			}
			else if(s1.charAt(i)=='e'||s1.charAt(i)=='E') {
				s2=s2+'2';
			}
			else if(s1.charAt(i)=='i'||s1.charAt(i)=='I') {
				s2=s2+'3';
			}
			else if(s1.charAt(i)=='o'||s1.charAt(i)=='O') {
				s2=s2+'4';
			}
			else if(s1.charAt(i)=='u'||s1.charAt(i)=='U') {
				s2=s2+'5';
			}
			else {
				s2=s2+s1;
			}
		}
		System.out.println(s2);
	}

}