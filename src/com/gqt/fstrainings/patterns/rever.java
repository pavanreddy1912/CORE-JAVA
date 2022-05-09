package com.gqt.fstrainings.patterns;

//printing in reverse order from 25 to 0
public class rever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j;
		int count=25;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print(count);
				System.out.print("  ");
				count--;
			}
			System.out.println("");
			
		}
		
		
	}       

}