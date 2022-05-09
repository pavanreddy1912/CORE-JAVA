package com.gqt.fstrainings.patterns;

//- * * * * * * * * *  
//- - * * * * * * *  
//- - - * * * * *  
//- - - - * * *  
//- - - - - * 
public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("-");
				System.out.print(" ");
			}
				
			for(int j=1;j<=(11-2*i);j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}

}
