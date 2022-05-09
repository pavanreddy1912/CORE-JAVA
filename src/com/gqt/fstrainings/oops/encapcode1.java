package com.gqt.fstrainings.oops;


class dog{
	private String name;
	private int cost;
	private String breed;
	private String color;
//	creating independent setters and getters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
//	creating generic setter and getter
	void setdata(String name, int cost, String breed,String color) {
		this.name=name;
		this.cost=cost;
		this.breed=breed;
		this.color=color;
	}
	void getdata() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println(color);
	}
//	creating behaviors 
	void run() {
		System.out.println("Dog runs");
	}
	void eat() {
		System.out.println("dog eats");
	}
}
public class encapcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
//		assigning the data using the generic setter
		d.setdata("tommy", 1000, "br", "brown");
		//print the data using generic getter
		d.getdata();
		System.out.println("------------------------------------");
		//assigning the data using specific setter
		d.setName("rocky");
		d.setCost(10000);
		d.setBreed("br");
		d.setColor("black");
		//printing the data using specific getter
		System.out.println(d.getName());
		System.out.println(d.getCost());
		System.out.println(d.getColor());
		System.out.println(d.getBreed());
	}

}
