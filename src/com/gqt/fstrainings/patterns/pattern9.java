package com.gqt.fstrainings.patterns;


//* * * * * 
//* - - - * 
//* - - - * 
//* - - - * 
//* * * * * 

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
			{
				if(i>=2&&i<=4) {
					if(j>=2&&j<=4) {
						System.out.print("-");
						System.out.print(" ");
					}
					if(j==1||j==5) {
						System.out.print("*");
						System.out.print(" ");						
					}
				
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
