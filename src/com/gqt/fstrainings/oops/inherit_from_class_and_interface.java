package com.gqt.fstrainings.oops;

import java.util.Scanner;

interface personal_details{
	void name();
	void age();
}
class ed_details{
	void inter_marks() {
		System.out.println("marks : 997 ");
		
	}
	void tenth_marks() {
		
		System.out.println("tenth marks :650 ");
		
	}
}
class details extends ed_details implements personal_details{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
		System.out.println("enter the name :Naveen ");
	
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		
		System.out.println("enter the age :45 ");
		
	}	
}
class refere{
	void permit(details d) {
		d.name();
		d.age();
		d.inter_marks();
		d.tenth_marks();
	}
}
public class inherit_from_class_and_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details d= new details();
		refere r= new refere();
		r.permit(d);
	}

}
