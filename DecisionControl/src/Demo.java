//Object: toString()

class Employee{
	int id = 101;
	String employee = "Rahul";
	
	@Override
	public String toString(){
		return  this.id +" "+ this.employee;
	}
}
public class Demo {

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println(obj);
		
		String obj2 = "Java";
		System.out.println(obj2.toString());

	}

}
