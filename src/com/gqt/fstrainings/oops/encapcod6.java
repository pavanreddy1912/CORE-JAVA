package com.gqt.fstrainings.oops;

class vehicle1 extends Object{
	String brand;
	int yom;
	int cost;
	int no_of_wheels;
	/**
	 * @param brand
	 * @param yom
	 * @param cost
	 * @param no_of_wheels
	 */
	public vehicle1(String brand, int yom, int cost, int no_of_wheels) {
		super();
		this.brand = brand;
		this.yom = yom;
		this.cost = cost;
		this.no_of_wheels = no_of_wheels;
	}
	
	
}
class renault extends vehicle1{
	public renault(String brand, int yom, int cost, int no_of_wheels) {
		super(brand,yom,cost,no_of_wheels);
		
	}
	public renault() {
		this("toyata",2021,440000,4);
	}
	void getData() {
		System.out.println(brand);
		System.out.println(yom);
		System.out.println(cost);
		System.out.println(no_of_wheels);
	}
}
public class encapcod6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		renault r = new renault();
		r.getData();
		System.out.println("----------------------------");
	}

}
