package com.gqt.fstrainings.oops;


interface car12{
	void brand();
	void country();
}
interface car23{
	void cost();
	void fuel();
}
interface car3 extends car12,car23{
	void color();
	
}
class vehi implements car3{

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("its from benz");
	}

	@Override
	public void country() {
		// TODO Auto-generated method stub
		System.out.println("its from united kingdom");
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("its cost is 1cr");
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("its diesel");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("its black");
	}
	
}
class all{
	void permit(car3 c) {
		c.brand();
		c.color();
		c.cost();
		c.country();
		c.fuel();
	}
}
public class multipleinheritanceininterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehi v = new vehi();
		all a = new all();
		a.permit(v);
	}

}
