package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class addnumbers_instring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String containing the numbers : ");
		String s1=sc.nextLine();
		int sum=0;
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=48&&s1.charAt(i)<=57) {
				char ch = s1.charAt(i);
				int a = Integer.parseInt(String.valueOf(ch));
				sum=sum+a;
			}
			if(!(s1.charAt(i)>=48&&s1.charAt(i)<=57)) {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2+sum);
	}

}
