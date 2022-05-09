package com.gqt.fstrainings.patterns;


//01  
//02 07  
//03 08 13  
//04 09 14 19  
//05 10 15 20 25  
public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<=5;i++) {
			int count =i;
			for(int j=1;j<=i;j++) {
				if(count<10) {
					System.out.print("0");
					System.out.print(count);
					System.out.print(" ");
				}
				else {
					System.out.print(count);
					System.out.print(" ");
				}
				count=count+5;
			}
			System.out.println(" ");
	}
	}

}
