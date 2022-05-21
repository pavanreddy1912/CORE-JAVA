package com.gqt.fstrainings.strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1=sc.next();
		System.out.println("Enter the second string : ");
		String s2=sc.next();
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		                                            
		
		System.out.println(Arrays.equals(c1, c2));
	}

}
