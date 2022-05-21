package com.gqt.fstrainings.oops;

class encap{
	private String name;
	private int milage ;
	private int cost;
	
	public encap(String name, int milage,int cost) {
		this.name=name;
		this.cost=cost;
		this.milage=milage;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the milage
	 */
	public int getMilage() {
		return milage;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	public void getData() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(milage);
	}
	
}
abstract class abstract_vehicle{
	abstract void Brand();
	abstract void cost();
	void name() {
		System.out.println("E-class");
	}
}
class inherit_vehicle extends abstract_vehicle{

	@Override
	void Brand() {
		// TODO Auto-generated method stub
		System.out.println("the brans is benz");
	}

	@Override
	void cost() {
		// TODO Auto-generated method stub
		System.out.println("the cost is 4000000");
	}
	
}
class polymor{
	void permit(abstract_vehicle ref) {
		ref.name();
		ref.Brand();
		ref.cost();
	}
}
public class encapcodetapacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap c = new encap("benz", 100000, 20);
		
		c.getData();
		System.out.println("-----------------------------");
		inherit_vehicle iv = new inherit_vehicle();
		polymor a = new polymor();
		a.permit(iv);
	}

}
