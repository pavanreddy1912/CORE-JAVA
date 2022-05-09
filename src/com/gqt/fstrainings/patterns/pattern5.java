package com.gqt.fstrainings.patterns;

//1 1 1 1 1
//0 0 0 0 0
//1 1 1 1 1
//0 0 0 0 0
//1 1 1 1 1
//% gives the remainder 
//10%2 gives the remainder as 0
//7%2 gives the remainder as 1


public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
			{
				if(i%2==0) {
					System.out.print("0");
					System.out.print(" ");
					
				}
				else {
					System.out.print("1");
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
		
}
