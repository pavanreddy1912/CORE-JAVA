package com.gqt.fstrainings.oops;


class car2 extends Object{
	String name;
	String brand;
	int cost ;
	String color;
	
	public car2() {
		super();
		this.name="Maybach";
		this.brand="Benz";
		this.cost=4400000;
		this.color ="black";
	}
	public car2(String name,String brand,int cost,String color) {
		super();
		this.name=name;
		this.brand=brand;
		this.cost=cost;
		this.color =color;
	}
	void getData(){
		System.out.println(name);
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(color);
	}
}
class benz extends car2{
	public benz() {
		super();
	}
}
class benz1 extends car2{
	public benz1(String name, String brand,int cost ,String color) {
		super(name,brand,cost,color);
		this.name=name;
		this.brand=brand;
		this.cost=cost;
		this.color=color;
	}
	void getData(){
		System.out.println(name);
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(color);
	}
	
}
public class encapcode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		benz b = new benz();
		b.getData();
		System.out.println("----------------------------");
		
		benz1 b1 = new benz1("e-class","mercedes-benz",4400000,"red");
		b1.getData();
		System.out.println("----------------------------");
	}

}
