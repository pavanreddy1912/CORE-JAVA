package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class AESprogram {
	public static boolean aesnum(int n) {
		int count =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count ==4) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find AES : ");
		int n= sc.nextInt();
		boolean res=aesnum(n);
		if(res) {
			System.out.println("is AES");
		}
		else {
			System.out.println("not AES");
		}
	}

}
