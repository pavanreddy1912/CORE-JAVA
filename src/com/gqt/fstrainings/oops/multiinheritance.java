package com.gqt.fstrainings.oops;

interface cars1{
	void cost();
	void brand();
}
interface cars2{
	void color();
	void speed();
}
class innova1 implements cars1,cars2{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color is red");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("it can reach 100kmph in 5 seconds");
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("it will cost upto 20 lakhs");
	}

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("it is from toyota");
	}
	
}
public class multiinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innova1 in = new innova1();
		in.brand();
		in.color();
		in.cost();
		in.speed();
	}

}
