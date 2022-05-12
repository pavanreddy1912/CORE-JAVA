package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class substringusinginbuiltfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string which need substring : ");
		String s1 = sc.next();
		
		for(int i =0;i<s1.length();i++) {
			
			for(int j=i+1;j<=s1.length();j++) {
				System.out.println(s1.substring(i, j));
			}
			
		}
	}

}
