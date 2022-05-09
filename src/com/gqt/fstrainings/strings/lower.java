package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1= sc.nextLine();
		char [] ch= s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65&&ch[i]<=90) {
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
