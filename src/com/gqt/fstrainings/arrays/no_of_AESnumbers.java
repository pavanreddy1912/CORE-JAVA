package com.gqt.fstrainings.arrays;

import java.util.Scanner;

public class no_of_AESnumbers {
	public static boolean numofaes(int n) {
		int count=0;
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
		System.out.println("Enter the initial point ");
		int l = sc.nextInt();
		System.out.println("Enter the number until which we need to find the AES : ");
		int n=sc.nextInt();
		int aes=0;
		for(int i=l;i<=n;i++) {
			if(numofaes(i)) {
				aes++;
			}
		}
		System.out.println("total number of aes numbers under "+n+"is "+aes);
	}

}
