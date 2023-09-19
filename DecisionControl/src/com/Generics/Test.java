package com.Generics;
//Reusability

class GenericClass<T>{
	private T obj;
	//private V obj2;
	
	GenericClass(T obj){
		this.obj = obj;
	}
	
	public T getObj(){
		return obj;
	}
}

public class Test {
	
	public static void main(String[] args) {
		GenericClass<Integer> obj = new GenericClass<Integer>(10);
		Integer result = obj.getObj();
		
		GenericClass<Double> obj2 = new GenericClass<Double>(10.456);
		Double result2 = obj2.getObj();

	}

}


/*public void typeSafety(){
	//Type Safety : 
	
			ArrayList list = new ArrayList();
			list.add("Hello");
			list.add("Hi");
			list.add(new Integer(100));
			
			String str = (String)list.get(0);
			System.out.println(str);
			
			String str2 =(String) list.get(2);
			System.out.println(str2);
}

public class Test {
	//Explicit conversion
	Object obj;
	Test(Object obj){
		this.obj = obj;
	}
	
	public Object getValue(){
		return obj;
	}

	public static void main(String[] args) {
		
		Integer intObj = new Integer(10);//toString()
		String strObj = "Java";
		
		Test t = new Test(intObj);
		Test t2 = new Test(strObj);
		
		Integer result = (Integer)t.getValue();
		System.out.println(result);
		
		
		
		
		
		
		
		

	}

}


class Demo{
	Integer obj;
	Demo(Integer obj){
		this.obj = obj;
	}
	
	public Integer getObject(){
		return obj;
	}
}

class Demo2{
	Double obj;
	Demo2(Double obj){
		this.obj = obj;
	}
	
	public Double getObject(){
		return obj;
	}
}


public class Test {
	
	public static void main(String[] args) {
		Integer obj = new Integer(200);
		Demo d = new Demo(obj);
		
		Double obj2 = new Double(200.456);
		Demo2 d2 = new Demo2(obj2);	

	}

}

*/
