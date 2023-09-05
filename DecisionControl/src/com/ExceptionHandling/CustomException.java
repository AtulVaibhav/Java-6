package com.ExceptionHandling;



class StudentNotFound extends Exception{
	String msg;
	public StudentNotFound() {
		
	}
	StudentNotFound(String msg){
		this.msg = msg;
	}
	public String getMsg(){
		return this.msg;
	}
}

public class CustomException {
     public static void m1(int i) {
    	
    		try {
    			if(i==102){
    				throw new StudentNotFound("Id doesn't match");	
    			}
				//
			} catch (Exception e) {
//				System.out.println(e.getMsg());
				System.out.println("Hello");
			}
    		System.out.println(i);
    		 
    	 
     }
	public static void main(String[] args) {
		m1(102);

	}

}
