package com.gqt.fstrainings.patterns;

//- - - - - -  
//- - - - - *  
//- - - - * * *  
//- - - * * * * *  
//- - * * * * * * *  
//- * * * * * * * * *  
//- * * * * * * * * *  
//- - * * * * * * *  
//- - - * * * * *  
//- - - - * * *  
//- - - - - * 
public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			if(i<=5) {
				for(int j=5;j>=i;j--) {
					System.out.print("-");
					System.out.print(" ");
				}
					
				for(int j=1;j<=(2*i-1);j++) {
					System.out.print("*");
					System.out.print(" ");
				}
			}
			else {
				for(int j=1;j<=i-5;j++) {
					System.out.print("-");
					System.out.print(" ");
				}
				for(int j=1;j<=(11-2*(i-5));j++) {
					System.out.print("*");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}