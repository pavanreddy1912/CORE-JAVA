package com.gqt.fstrainings.patterns;

//$ $ $ $ $ * * * * *
//$ $ $ $ $ * * * * *
//$ $ $ $ $ * * * * *
//$ $ $ $ $ * * * * *
//$ $ $ $ $ * * * * *

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++)
			{
				if(j<=5) {
					System.out.print("$");
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
