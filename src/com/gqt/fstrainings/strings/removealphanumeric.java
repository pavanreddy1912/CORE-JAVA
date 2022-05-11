package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class removealphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to count the alphabets : ");
		String s1 = sc.nextLine();
		String res="";
		for(int i =0;i<s1.length();i++) {
			if(!(s1.charAt(i)>=65&&s1.charAt(i)<=90||s1.charAt(i)>=97&&s1.charAt(i)<=122
					||s1.charAt(i)>=48&&s1.charAt(i)<=57)) {
				res=res+s1.charAt(i);
			}
		}
		System.out.println("the alphabets count is : "+res);
	}

}
