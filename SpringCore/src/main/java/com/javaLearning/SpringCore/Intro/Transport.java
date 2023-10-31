package com.javaLearning.SpringCore.Intro;

public class Transport {
    private Vehicle vehicle;
    
    public Transport(Vehicle vehicle){
    	this.vehicle = vehicle;
    }
    
    public void getSpeed(){
    	vehicle.speed();
    }
    
}
