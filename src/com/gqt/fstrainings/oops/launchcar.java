package com.gqt.fstrainings.oops;

class car{
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
class ferrari extends car{
	@Override
	void speed() {
		System.out.println("reaches 100kmph in 2.3secs");
	}
	void cost() {
		System.out.println("it costs upto 3cr");
	}
}
class innova extends car{
	@Override
	void speed() {
		System.out.println("reaches 100kmph in 10secs");
	}
	void cost() {
		System.out.println("it costs upto 25lakhs");
	}
}
class premierpadmini extends car{
	@Override
	void speed() {
		System.out.println("reaches 100kmph in 30 secs");
	}
	void cost() {
		System.out.println("it costs upto 10lakhs");
	}
}

public class launchcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ferrari f = new ferrari();
		innova i = new innova();
		premierpadmini pp = new premierpadmini();
		
		car ref;
		
		ref = f;
		ref.start();
		ref.speed();
		ref.stop();
		f.cost();
		System.out.println("--------------------------");
		
		ref = i;
		ref.start();
		ref.speed();
		ref.stop();
		i.cost();
		System.out.println("--------------------------");
		
		ref = pp;
		ref.start();
		ref.speed();
		ref.stop();
		pp.cost();
		System.out.println("--------------------------");
	}

}
