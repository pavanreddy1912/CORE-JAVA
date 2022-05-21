package com.gqt.fstrainings.oops;

class brain{
	private float weight;
	int iq;
	/**
	 * @param weight
	 * @param iq
	 */
	public brain(float weight, int iq) {
		super();
		this.weight = weight;
		this.iq = iq;
	}
	public float getWeight() {
		return weight;
	}
	public int getIq() {
		return iq;
	}
	
}
class heart1{
	int beat;
	float weight;
	/**
	 * @param beat
	 * @param weight
	 */
	public heart1(int beat, float weight) {
		super();
		this.beat = beat;
		this.weight = weight;
	}
	/**
	 * @return the beat
	 */
	public int getBeat() {
		return beat;
	}
	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}
	
	
}
class book1{
	String name;
	String author;
	/**
	 * @param name
	 * @param author
	 */
	public book1(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	
	
}
class bike{
	String brand;
	int cost;
	
	/**
	 * @param brand
	 * @param cost
	 */
	public bike(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}	
}
class human1{
	brain br = new brain(3.02f,100);
	heart1 hr = new heart1(100,120);
}
class student2 extends human1{
	void hasbook(book1 bk) {
		System.out.println(bk.getName());
		System.out.println(bk.getAuthor());
	}
	void hasbike(bike bi) {
		System.out.println(bi.getBrand());
		System.out.println(bi.getCost());
	}
}
public class launch2 {
	public static void main(String[] args) {
		
		student2 s = new student2();
		book1 bk = new book1("pavan","banu");
		bike bi = new bike("bmw",400000);
		
		System.out.println(s.br.getIq());
		System.out.println(s.br.getWeight());
		System.out.println(s.hr.getBeat());
		System.out.println(s.hr.getWeight());
		
		s.hasbike(bi);
		s.hasbook(bk);
	}
}