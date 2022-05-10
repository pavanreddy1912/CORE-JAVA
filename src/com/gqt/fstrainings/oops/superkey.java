package com.gqt.fstrainings.oops;
/**
 * 
 * @author jokerboy
 *class Object {
 *	Object(){
 *}
 *}
 */
class dog3 extends Object{
	private String name;
	private int cost;
	private String breed;
	private String color;
	
	public dog3() {
		this("ricky");
	}
	public dog3(String name) {
		this("jimmy",50000);
		this.name=name;
	}
	public dog3(String name , int cost) {
		this("tommy",4000,"gr");
		this.name=name;
		this.cost=cost;
	}
	public dog3(String name , int cost,String breed) {
		this("tommy",6000,"pug","black");
		this.name=name;
		this.cost=cost;
		this.breed=breed;
	}
	public dog3(String name , int cost,String breed,String color) {
		super();
		this.name=name;
		this.cost=cost;
		this.breed=breed;
		this.color=color;
	}
	void getData() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println(color);
	}
}

public class superkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog3 d1=new dog3();
		d1.getData();
		System.out.println("----------------------------------");
	}

}
