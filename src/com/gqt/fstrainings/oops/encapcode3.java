package com.gqt.fstrainings.oops;

class car1{
	private String brand;
	private int cost;
	private String name;
	private String color;
	
	public car1() {
		
	}
	public car1(String brand) {
		this.brand=brand;
	}
	public car1(String brand,int cost) {
		this.brand=brand;
		this.cost=cost;
	}
	public car1(String brand,int cost,String name) {
		this.brand=brand;
		this.cost=cost;
		this.name=name;
	}
	public car1(String brand,int cost,String name,String color) {
		this.brand=brand;
		this.cost=cost;
		this.name=name;
		this.color=color;
	}
	void getdata() {
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(name);
		System.out.println(color);

	}
}
public class encapcode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 c=new car1();//zero parameter
		car1 c1 = new car1("toyata") ;//one parameter
		car1 c2 = new car1("audi",4000000);//two parameter
		car1 c3 = new car1("suzuki",500000,"iten");//three parameter
		car1 c4=new car1("renault",600000,"duster","red");//four parameter
		
		c.getdata();
		System.out.println("--------------------------");
		c1.getdata();
		System.out.println("--------------------------");
		c2.getdata();
		System.out.println("--------------------------");
		c3.getdata();
		System.out.println("--------------------------");
		c4.getdata();
		System.out.println("--------------------------");
	}

}
