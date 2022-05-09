package com.gqt.fstrainings.oops;

class Animal{
	void wakeup() {
		System.out.println(" Wakes up ");
	}
	void eat(){
		System.out.println("eats ");
	}
	void sleep() {
		System.out.println("sleeps ");
	}
}
class lion extends Animal {
	@Override
	void eat() {
		System.out.println("Lion eats meat");
	}
	void Carnivores() {
		System.out.println("it belongs Carnivores ");
	}
}
class deer extends Animal{
	@Override
	void eat() {
		System.out.println("Deer eats Grass");
	}
	void harbivorous(){
		System.out.println("it belongs to Harbivorous animals");
	}
}
class frog extends Animal {
	@Override
	void eat() {
		System.out.println("Frogs eats insects");
	}
	void Amphibians() {
		System.out.println("it belongs to amphibians");
	}
}
public class forestanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion li = new lion();
		li.wakeup();
		li.eat();
		li.sleep();
		li.Carnivores();
		System.out.println("----------------------------------------");
		
		deer de = new deer();
		de.wakeup();
		de.eat();
		de.sleep();
		de.harbivorous();
		System.out.println("----------------------------------------");
		
		frog fr = new frog();
		fr.wakeup();
		fr.eat();
		fr.sleep();
		fr.Amphibians();
		System.out.println("----------------------------------------");
	}

}
