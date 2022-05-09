package com.gqt.fstrainings.oops;

import java.util.Scanner;

class favactress{
	void take_in() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name of the favorite singer : ");
		String act=sc.next();
		System.out.println("The favourite singer is :"+act);
	}
	void sprint() {
		System.out.println("you know it right");
	}
	void getout() {
		System.out.println("we're leaving");
	}
}

class actor extends favactress{
	@Override
	void sprint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("the number is : "+n);
	}
	
}
class acting{
	void allow(favactress ref) {
		ref.take_in();
		ref.sprint();
		ref.getout();
	}
}
public class actress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		actor a = new actor();
		acting ac = new acting();
		
		ac.allow(a);
	}

}