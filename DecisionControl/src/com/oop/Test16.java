package com.oop;

interface ModeOfTransportation{
	void speed();
}

class Bus implements ModeOfTransportation{

	@Override
	public void speed() {
		System.out.println("Bus spedd : 120km/hr");
		
	}
	
}

class Train implements ModeOfTransportation{

	@Override
	public void speed() {
		System.out.println("Train speed :150km/hr");
		
	}
	
}

class Flights implements ModeOfTransportation{

	@Override
	public void speed() {
		System.out.println("Flight speed: 700km/hr");
		
	}
	
}

class Vechile{
	
	ModeOfTransportation modeOfTransportation;
	
	Vechile(ModeOfTransportation modeOfTransportation){
		this.modeOfTransportation = modeOfTransportation;
		
	}
	public void getSpeed(){
		modeOfTransportation.speed();
	}
}


public class Test16 {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Train train = new Train();
		Flights flight = new Flights();
		Vechile vehicle = new Vechile(train);
		vehicle.getSpeed();

	}

}
