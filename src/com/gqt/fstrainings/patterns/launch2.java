package com.gqt.fstrainings.patterns;

class Car{
	String name;
	String color;
	int cost;
	String brand;
	/**
	 * Description: this is the method to indicate the start behaviour of the car
	 * return type :void
	 *
	 */
	void start() {
		System.out.println("car started");
	}
	/**
	 * Description: this is the method to indicate the stop behaviour of the car
	 * return type :void
	 *
	 */
	void stop() {
		System.out.println("car stopped");
	}
	/**
	 * Description: this is the method to indicate the accelarate behaviour of the car
	 * return type :void
	 *
	 */
	void accelerate() {
		System.out.println("car is moving fast");
	}
	
}


public class launch2 {

	/**
	 * @param args
	 * Description:this is the main method which contains the objects of car class
	 * return type:void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.name="carnival";
		c.color="black";
		c.cost=25000;
		c.brand="Kia";
		System.out.println("the properties of the car are as follows:");
		System.out.println(c.name);//carnival
		System.out.println(c.color);//black
		System.out.println(c.cost);//25000
		System.out.println(c.brand);//kia
		System.out.println("the behaviours of the car are as follows:");
		c.start();//car is started
		c.stop();//car is stopped 
		c.accelerate();//car is moving fast 
		
		Car c1=new Car();
		c1.name="seltos";
		c1.color="blue";
		c1.cost=35000;
		c1.brand="Kia";
		System.out.println("the properties of the car are as follows:");
		System.out.println(c1.name);//carnival
		System.out.println(c1.color);//blue
		System.out.println(c1.cost);//35000
		System.out.println(c1.brand);//kia
		System.out.println("the behaviours of the car are as follows:");
		c1.start();//car is started
		c1.stop();//car is stopped 
		c1.accelerate();//car is moving fast 
		
		Car c2=new Car();
		c2.name="brezza";
		c2.color="red";
		c2.cost=25000;
		c2.brand="suzuki";
		System.out.println("the properties of the car are as follows:");
		System.out.println(c1.name);//brezza
		System.out.println(c1.color);//blue
		System.out.println(c1.cost);//25000
		System.out.println(c1.brand);//suzuki
		System.out.println("the behaviours of the car are as follows:");
		c2.start();//car is started
		c2.stop();//car is stopped 
		c2.accelerate();//car is moving fast
		
	}

}
