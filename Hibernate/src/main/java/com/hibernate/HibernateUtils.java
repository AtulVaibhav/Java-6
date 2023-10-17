package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//insert , update, delete:modification
//read

public class HibernateUtils {
     public static SessionFactory getSessionFactory(){
    	 Configuration configuration = new Configuration();
    	 SessionFactory factory =  configuration.configure("hibernate.cfg.xml")
    	                          .buildSessionFactory();
    	 
    	 
    	 return factory;
     }
     
     //save object inside db
     public static void saveEmployee(){
    	 Employee emp  = new Employee();
    	 emp.setEmpId(103);
    	 emp.setEmpName("Anuj");
    	 emp.setEmpAge(26);
    	 emp.setEmpDept("networking");
    	 
    	 //get Session object
    	   Session session =getSessionFactory().openSession();
    	 
    	 //get Transaction
    	   Transaction txn = session.beginTransaction();
    	 
    	 //save the object
    	   session.save(emp);
    	 
    	 //commit transaction
    	   txn.commit();
    	   
    	   System.out.println("Employee saved successfully");
    	   session.close();
    	 
     }
   
     //getById
     public static void getById(){
    	 Session session =getSessionFactory().openSession();
    	 //get(): null  
    	 //load() : exception
    	 Employee emp = session.get(Employee.class,102);
    	 if(emp==null){
    		 System.out.println("Employee doesn't exist");
    	 }else{
    	 System.out.println("EmpName :"+emp.getEmpName()+" EmpDept :"+emp.getEmpDept());
    	 }
    	 session.close();
     }  
     
     //update
     public static void updateEmployee(){
    	 Session session =getSessionFactory().openSession();
    	 Employee emp = session.get(Employee.class, 102);
    	 if(emp==null){
    		 System.out.println("Employee doesn't exist");
    	 }else{
    		 session.beginTransaction();
    		 emp.setEmpDept("Testing");
    		 session.save(emp);
    		 session.getTransaction().commit();
    		 System.out.println("Employee updated successfully");
    	 }
    	 session.close();
     }
     
     //delete
     public static void deleteById(){
    	 Session session =getSessionFactory().openSession();
    	 Employee emp = session.get(Employee.class, 102);
    	 if(emp==null){
    		 System.out.println("Employee doesn't exist");
    	 }else{
    		 session.beginTransaction();
    		 session.delete(emp);
    		 session.getTransaction().commit();
    		 System.out.println("Employee deleted successfully");
    	 }
    	 
    	 session.close();
     }
     
//HQL: Hibernte query language: Object -oriented query language
     // DB independent language
     
     public static void getAll(){
    	 Session session =getSessionFactory().openSession();
    	 //from
    	 String hql = "from Employee";
    	 Query query = session.createQuery(hql);
    	 List<Employee> list = query.list();
//    	 list.stream().forEach(emp ->{
//    		 System.out.println("EmpName :"+emp.getEmpName());
//    		 System.out.println("EmpDept :"+emp.getEmpDept());
//    		 System.out.println("EmpAge :"+emp.getEmpAge());
//    	 });
    	 
    	 for(Employee emp:list){
    		 System.out.println("EmpName :"+emp.getEmpName());
    		 System.out.println("EmpDept :"+emp.getEmpDept());
    		 System.out.println("EmpAge :"+emp.getEmpAge());
    	 }
     }
     
     

}
