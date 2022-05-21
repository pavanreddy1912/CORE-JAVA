package com.gqt.fstrainings.oops;

import java.util.Scanner;

abstract class shape{
	float area;
	
	abstract void getdata();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
	
}
class square extends shape{
	float side;
	@Override
	void getdata() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square : ");
		side=sc.nextFloat();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area = side*side;
	}
	
}
class rectangle1 extends shape {
	float length;
	float breadth;
	@Override
	void getdata() {
		// TODO Auto-generated method stub
		System.out.println("rectangle length and breadth : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the length : ");
		length=sc.nextFloat();
		System.out.println("Enter the side of the length : ");
		breadth=sc.nextFloat();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area=length * breadth;
	}
	
}
class circle1 extends shape{
	float radius;
	
	@Override
	void getdata() {
		// TODO Auto-generated method stub
		System.out.println("circle radius : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the length : ");
		radius=sc.nextFloat();
	}

	@Override
	void calculate() {
		// TODO Auto-generated method stub
		area=(3.14f)*radius*radius;
	}
	
}
class Geometry1{
	void geometry(shape ref) {
		ref.getdata();
		ref.calculate();
		ref.display();
	}
}
public class mathsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s = new square();
		rectangle1 r =new rectangle1();
		circle1 c = new circle1();
		
		Geometry1 g = new Geometry1();
		g.geometry(s);
		g.geometry(r);
		g.geometry(c);
	}

}

