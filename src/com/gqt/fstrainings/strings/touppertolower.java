package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class touppertolower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string containing upper and lower case : ");
		String s1 = sc.nextLine();
		String s2="";
		
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(s1.charAt(i)>=65&&s1.charAt(i)<=90) {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>=97&&ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
