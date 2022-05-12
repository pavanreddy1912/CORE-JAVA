package com.gqt.fstrainings.strings;

import java.util.Scanner;

public class frequencyofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to find the frequency");
		String s1 = sc.nextLine();
		
		char [] c=s1.toCharArray();
		for(int i =0;i<c.length;i++) {
			int count = 0;
			for(int j=0;j<c.length;j++) {
				if(j<i&&c[j]==c[i]) {
					break;
				}
				if(c[i]==c[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("the count of "+s1.charAt(i)+" is "+count);
			}
			
		}
	}

}
