package com.gqt.fstrainings.patterns;


//* 
//* * 
//* @ * 
//* @ @ * 
//* @ @ @ * 

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i==3&&j==2) {
					System.out.print("@");
					System.out.print(" ");
				}
				else if(i==4&&(j==2||j==3)) {
					System.out.print("@");
					System.out.print(" ");
				}
				else if(i==5&&(j==2||j==3||j==4)) {
					System.out.print("@");
					System.out.print(" ");
				}
				else {
					System.out.print("*");
					System.out.print(" ");
				}
			}
			System.out.println("");	
		}
	}

}