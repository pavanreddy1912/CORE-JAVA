package com.gqt.fstrainings.oops;

abstract class Bird{
	abstract void eat();
	abstract void fly();
	
}
abstract class eagle extends Bird{
	void fly() {
		System.out.println("it flies at most heights ");
	}	
}
class serpent extends eagle{
	void eat() {
		System.out.println("it eats at mountains");
	}
}
class golden extends eagle{
	void eat() {
		System.out.println("it eats fishes");
	}
}
class a1llow{
	void permit(eagle ref) {
		ref.eat();
		ref.fly();
	}
}
public class exmpAbstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serpent s=new serpent();
		golden g= new golden();
		
		a1llow a= new a1llow();
		a.permit(g);
		a.permit(s);
		
		
		
	}

}
