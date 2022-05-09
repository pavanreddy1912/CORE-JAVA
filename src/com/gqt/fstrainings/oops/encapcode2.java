package com.gqt.fstrainings.oops;


class cricketer{
	String name;
	int cost;
	float run_rate;
	String country;
//	creating a generic setter and getter
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
	 * @return the run_rate
	 */
	public float getRun_rate() {
		return run_rate;
	}
	/**
	 * @param run_rate the run_rate to set
	 */
	public void setRun_rate(float run_rate) {
		this.run_rate = run_rate;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
//	creating specific setters
	void take_in(String name,int cost,float run_rate,String country) {
		this.name = name;
		this.cost=cost;
		this.run_rate=run_rate;
		this.country=country;
	}
//	displaying the data using the specific getters 
	void getdata() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(run_rate);
		System.out.println(country);
	}
//	creating behaviors 
	void play() {
		System.out.println("he can play");
	}
	void run() {
		System.out.println("he can run");
	}
}
public class encapcode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cricketer c = new cricketer();
		
		c.take_in("dhoni", 100000, 12.3f, "india");
		c.getdata();
		System.out.println("-----------------------------");
		c.setName("Raina");
		c.setCost(10000);
		c.setRun_rate(12.5f);
		c.setCountry("india");
//		printing the data using specific getters
		System.out.println(c.getName());
		System.out.println(c.getCost());
		System.out.println(c.getRun_rate());
		System.out.println(c.getCountry());
	
	}


}

