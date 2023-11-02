package com.javaLearning.SpringCore.BeanLifeCycle;

public class Box {
	private int data;
	Box(){
		System.out.println("default constructor executed");
	}
	
	public void setData(int a){
		this.data = a;
		System.out.println("setter() executed");
	}
	
	public int getData(){
		return this.data;
	}
	
	public void afterPropertySet(){
		System.out.println("Object Property has been set.Ready to use");
	}
	
	
	public void destroyObject(){
		System.out.println("Object destroyed");
	}
	
	public void doSomeTask(){
		System.out.println("Object is processing some data.");
		System.out.println("Object completed its task");
	}
	
	
	
	

}
// constructor > setter > custom-init() >Object use > custom-destroy()
