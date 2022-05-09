package com.gqt.fstrainings.strings;

import java.util.Scanner;

/**
 * @author pavan
 *
 */
public class vowelscons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1= sc.nextLine();
		int vowels=0;
		int cons=0;
		for (int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if (ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
				vowels++;
				
			}
			else if(!(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')) {
				cons++;
			}
			
		}
		System.out.println("Vowels count is "+vowels);
		System.out.println("cons count: "+cons);
	}

}
