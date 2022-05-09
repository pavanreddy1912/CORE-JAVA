package com.gqt.fstrainings.oops;

class vehicle{
	void start() {
		System.out.println("Car started");
	}
	void speed() {
		System.out.println("goes faster ");
	}
	void stop() {
		System.out.println("car stopped ");
	}
}
class ford extends vehicle{
	@Override
	void speed() {
		System.out.println("reaches 100kmph in 2.3secs");
	}
	void cost() {
		System.out.println("it costs upto 3cr");
	}
}
class toyota extends vehicle{
	@Override
	void speed() {
		System.out.println("reaches 100kmph in 10secs");
	}
	void cost() {
		System.out.println("it costs upto 25lakhs");
	}
}
class amdassador extends vehicle{
	@Override
	void speed() {
		System.out.println("reaches 100kmph in 30 secs");
	}
	void cost() {
		System.out.println("it costs upto 10lakhs");
	}
}
class market{
	void allow(vehicle ref) {
		ref.start();
		ref.speed();
		ref.stop();
	}
	
}

public class Launchcar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ford f = new ford();
		toyota i = new toyota();
		amdassador pp = new amdassador();
		market m = new market();
		
		m.allow(f);
		f.cost();
		System.out.println("--------------------------");
		
		m.allow(i);
		i.cost();
		System.out.println("--------------------------");
		
		m.allow(pp);
		pp.cost();
		System.out.println("--------------------------");
	}

}
