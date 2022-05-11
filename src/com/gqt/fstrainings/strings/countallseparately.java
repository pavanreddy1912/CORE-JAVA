package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class countallseparately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to count : ");
		String s1 = sc.nextLine();
		int ccount=0;
		int vcount=0;
		int ncount=0;
		int scount=0;
		for(int i = 0;i<s1.length();i++) {
			if((s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'
					||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')) {
				vcount++;
			}
		}
		System.out.println("the count of consonants : "+vcount);
		for(int i = 0;i<s1.length();i++) {
			if(!(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'
					||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'
					||s1.charAt(i)>=48&&s1.charAt(i)<=57||s1.charAt(i)>=33&&s1.charAt(i)<=47
					||s1.charAt(i)>=58&&s1.charAt(i)<=64)) {
				ccount++;
			}
		}
		
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)>=48&&s1.charAt(i)<=57) {
				ncount++;
			}
		}
		for(int i =0;i<s1.length();i++) {
			if(!(s1.charAt(i)>=65&&s1.charAt(i)<=90||s1.charAt(i)>=97&&s1.charAt(i)<=122
					||s1.charAt(i)>=48&&s1.charAt(i)<=57)) {
				scount++;
			}
		}
		System.out.println("the count of vowels: "+vcount+" consonants : "+ccount+" numbers : "+ncount+
				" special characters : "+scount);
	}

}
