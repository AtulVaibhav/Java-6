package com.oop;

interface Sim{
	void simService();
	default void tarrifRate(){
		System.out.println("Tarrif: 0.5/paise");
	}
	static void simType(){
		System.out.println("Micro Sim");
	}
	
}

class Airtel implements Sim{
	public void simService(){
		System.out.println("Airtel Sim is working");
	}
}

class Idea implements Sim{
	public void simService(){
		System.out.println("Idea Sim is working");
	}
}

class Jio implements Sim{
	public void simService(){
		System.out.println("Jio Sim is working");
	}
}


class Mobile{
	Sim slot; // Aggregation
	Mobile(Sim slot){
		this.slot = slot;
	}
	
	public void talk(){
		slot.simService();
		slot.tarrifRate();
		Sim.simType();
	}
}
public class Test10 {

	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		Idea idea = new Idea();
		Jio jio = new Jio();
		Mobile mobile = new Mobile(jio);
		mobile.talk();

	}

}
