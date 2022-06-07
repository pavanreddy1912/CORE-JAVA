package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class reverse_the_string_without_reversing_the_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String of letters :");
		String s1 = sc.nextLine();
		String s2 = "";
		String[] s3 = s1.split(" ");
		for(int i =s3.length-1 ;i>=0;i--) {
			System.out.print(s3[i]+ " ");
		}
		
	}

}
