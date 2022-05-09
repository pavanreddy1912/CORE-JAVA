package com.gqt.fstrainings.oops;

import java.net.DatagramSocket;

class Heart{
	private float beat;
	private int size;
	//using this constructor we assign the values to the object
	public Heart(float beat, int size) {
		super();
		this.beat = beat;
		this.size = size;
	}
	//using this we will be able to get the beat independently
	public float getBeat() {
		return beat;
	}
	//using this we will be able to get the size independently
	public int getSize() {
		return size;
	}
	
}
class book{
	private String name;
	private String author;
	//using this constructor we assign the values to the object
	public book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	//using this we will be able to get the name independently
	public String getName() {
		return name;
	}
	//using this we will be able to get the author independently
	public String getAuthor() {
		return author;
	}
		
}
class Student{
	Heart h = new Heart(72,45);
	
	void hasbook(book b) {
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
	}
}
public class launch {
	public static void main(String[] args) {
		Student s = new Student();
		book b = new book("pavan","banu");
		
		System.out.println(s.h.getBeat());
		System.out.println(s.h.getSize());
		s.hasbook(b);
		
		s=null;
//		System.out.println(s.h.getBeat());
//		System.out.println(s.h.getSize());
//  	s.hasbook(b);
		System.out.println(b.getAuthor());
		System.out.println(b.getName());
	}
}
