package com.MultiThreading;

class Tickets{
	static int availableSeats=10;
	public synchronized void bookTicket(String name, int requestedSeats){
		System.out.println("Username :"+name+" ,Seats requested :"+requestedSeats);
		System.out.println("Checking for availability.Please wait....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(availableSeats>=requestedSeats){
			System.out.println("Name "+name+" "+requestedSeats +"seats reserved successfully..");
			availableSeats = availableSeats - requestedSeats;
		}else{
			System.out.println("Number of available Seats "+availableSeats);
			System.out.println("No seats available.Sorry for inconvience");
		}
	}
}

//Thread1
class User1 extends Thread{
	String name;
	int requestedSeats;
	Tickets tickets;
	public User1(String name, int requestedSeats, Tickets tickets) {
		super();
		this.name = name;
		this.requestedSeats = requestedSeats;
		this.tickets = tickets;
	}
	
	public void run(){
		tickets.bookTicket(name,requestedSeats);
	}
	
}

//Thread2
class User2 extends Thread{
	String name;
	int requestedSeats;
	Tickets tickets;
	public User2(String name, int requestedSeats, Tickets tickets) {
		super();
		this.name = name;
		this.requestedSeats = requestedSeats;
		this.tickets = tickets;
	}
	
	public void run(){
		tickets.bookTicket(name,requestedSeats);
	}
	
}
public class ReservationSystem {

	public static void main(String[] args) {
		Tickets obj = new Tickets();
		User1 user1 = new User1("Pawan",7,obj);
		User2 user2 = new User2("Amit",5,obj);
		user1.start();
		user2.start();

	}

}
