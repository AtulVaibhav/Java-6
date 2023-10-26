package com.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
     Session session  = factory.openSession();
     
     /* from : all data from db
     String hql = "from EmployeeInfo";
     Query query =session.createQuery(hql);
     query.setFirstResult(0);
     query.setMaxResults(5);
     List<EmployeeInfo> list =query.list();
     System.out.println("EmpId    \tEmpName    \tEmpAge      \tEmpSalary");
     System.out.println("_____________________________________________________________");
     for(EmployeeInfo emp : list){
    	 System.out.println(emp.getEmpId()+"     \t"+emp.getEmapName()+"       \t"+emp.getEmpAge()+"       \t"+emp.getEmpSalary());
     }
     
      select
     
     String hql = "select e.emapName , e.empSalary from EmployeeInfo e";
     Query query = session.createQuery(hql);
     query.setFirstResult(0);
     query.setMaxResults(5);
     List<Object[]> list = query.list();
     System.out.println("EmpName  \tEmpSalary");
     for(Object[] obj:list){
    	 String name = (String) obj[0];
    	 Double salary = (Double) obj[1];
    	 System.out.println(name+"           "+salary);
     }*/
     
     
     //where
     String hql = "select e.emapName from EmployeeInfo e where e.empSalary>= 50000";
     Query query = session.createQuery(hql);
     List<String> listOfNames = query.list();
     System.out.println("List of Employees");
     System.out.println("______________________________________");
     for(String name:listOfNames){
    	 System.out.println(name);
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
