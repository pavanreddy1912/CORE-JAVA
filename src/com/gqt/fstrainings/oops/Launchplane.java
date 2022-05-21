package com.gqt.fstrainings.oops;

interface plane{
	public abstract void take_off();
	public abstract void fly();
	public abstract void carries();
}

class fighterplane implements plane{

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		System.out.println("fighter plane took off");
		
	}

	@Override
	public void fly() {

		// TODO Auto-generated method stub
		System.out.println("flies at higher altitudes ");
	}

	@Override
	public void carries() {
		// TODO Auto-generated method stub
		System.out.println("it carries weapons");
	}
	
}
class passenger implements plane {

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		System.out.println("passenger plane took off");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flies at lower altitudes ");
	}

	@Override
	public void carries() {
		// TODO Auto-generated method stub
		System.out.println("it carries humans");
	}
	
}
class cargo implements plane{

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		System.out.println("cargo plane took off");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flies at medium altitudes ");
	}

	@Override
	public void carries() {
		// TODO Auto-generated method stub
		System.out.println("it carries goods");
	}
	
}
class allow{
	void permit(plane ref) {
		ref.take_off();
		ref.fly();
		ref.carries();
		
	}
}
public class Launchplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fighterplane fp = new fighterplane();
		passenger p = new passenger ();
		cargo c = new cargo();

		allow a = new allow();
		a.permit(fp);
		System.out.println("--------------------------------");
		a.permit(p);
		System.out.println("--------------------------------");
		a.permit(c);
		System.out.println("--------------------------------");
	}

}
