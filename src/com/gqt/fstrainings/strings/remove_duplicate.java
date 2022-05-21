package com.gqt.fstrainings.strings;



import java.util.Scanner;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1= sc.next();
		String s2="";
		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if((ch!=' ')) {
				s2=s2+ch;
				s1=s1.replace(ch, ' ');
			}
		}

		
		System.out.println(s2);
	}

}
