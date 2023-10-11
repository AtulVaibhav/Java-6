package com.StreamAPI;

//Method Reference :referring to some method- ::
// referring to non-static method :classObj.method()-> classObj::methodName
// refer static function :className.methodName() -> className::methodName




@FunctionalInterface
interface Account{
	void salaryCalculation(int numberOfWorkingDays);
}

class EmployeeDetails {
	public void getSalary(int numberOfdays){
		System.out.println(numberOfdays*1000);
	}
}
class EmployeeDetails2 {
	public void getSalary(int numberOfdays){
		System.out.println(numberOfdays*500);
	}
}
class EmployeeData{
	public static void salaryDay(int numberOfDays){
		System.out.println(numberOfDays*2000);
	}
}


public class Test5 {

	public static void main(String[] args) {
//		Account account = (no_of_days)->System.out.println(no_of_days*1000);
//        account.salaryCalculation(23);
		
//		EmployeeDetails2 emp = new EmployeeDetails2();
//		Account account = emp::getSalary;
//		account.salaryCalculation(23);
		
		Account account = EmployeeData::salaryDay;
		account.salaryCalculation(20);
		
		
	}

}
