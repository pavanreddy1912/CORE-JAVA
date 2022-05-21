package com.gqt.fstrainings.oops;

interface calci{
	void add();
	void sub(); 
}
class add implements calci{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a =10 ;
		int b=20;
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a =5;
		int b=10;
		float c= b/a;
		System.out.println(c);
	}
	public void mul() {
		int a =5;
		int b=10;
		int c =a*b;
		System.out.println(c);
	}
	
}
public class LaunchInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add a = new add();
		calci c ;
		c=a;
		c.add();
		c.sub();
//		c.mul(); cannot be accessed
		((add)(c)).mul();
	}

}
