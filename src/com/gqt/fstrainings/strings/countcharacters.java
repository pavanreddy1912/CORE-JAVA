package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class countcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to count : ");
		String s1=sc.nextLine();
		
		int count =0;
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				count = count +1;
			}
		}
		
		System.out.println("the length is : "+count);
	}

}
