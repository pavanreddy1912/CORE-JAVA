package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1= sc.nextLine();
		
		s1= s1.replace('a','1');
		s1=s1.replace('e', '2');
		s1=s1.replace('i', '3');
		s1=s1.replace('o', '4');
		s1=s1.replace('u', '5');
		s1= s1.replace('A','1');
		s1=s1.replace('E', '2');
		s1=s1.replace('I', '3');
		s1=s1.replace('O', '4');
		s1=s1.replace('U', '5');
		System.out.println("new String : "+s1);
	}

}