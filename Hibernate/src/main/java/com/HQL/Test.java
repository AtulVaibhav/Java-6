package com.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//modifying table : WriteMode :insert, update, delete:transaction is required

// select :ReadMode : fetching :
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
     }
     
     
     //where
     String hql = "select e.emapName from EmployeeInfo e where e.empSalary>= 50000";
     Query query = session.createQuery(hql);
     List<String> listOfNames = query.list();
     System.out.println("List of Employees");
     System.out.println("______________________________________");
     for(String name:listOfNames){
    	 System.out.println(name);
     }
     
     //oreder by
     String hql = "select e.emapName from EmployeeInfo e order by e.empAge DESC";
     Query query = session.createQuery(hql);
     List<String> listOfNames = query.list();
     System.out.println("List of Employees based on Age");
     System.out.println("______________________________________");
     for(String name:listOfNames){
    	 System.out.println(name);
     }
     
     //update
     Scanner sc = new Scanner(System.in);
     String hql = "update EmployeeInfo e set e.emapName=:name where e.empAge=:age";
     session.beginTransaction();
     Query query = session.createQuery(hql);
     System.out.println("Enter the name to be updated");
     String name = sc.next();
     query.setParameter("name",name );
     System.out.println("Enter the age whose name needs to be updated");
     int age = sc.nextInt();
     query.setParameter("age", age);
     
     int i = query.executeUpdate();
     session.getTransaction().commit();
     System.out.println(i+ " row affected");
     
     
     
     //delete:
     Scanner sc = new Scanner(System.in);
     session.beginTransaction();
     String hql = "delete from EmployeeInfo e where e.empId=:id";
     Query query = session.createQuery(hql);
     System.out.println("Enter the id ");
     int id = sc.nextInt();
     query.setParameter("id", id);
     int i = query.executeUpdate();
     session.getTransaction().commit();
     System.out.println(i+" row affected");
     
    
     //Aggregate function
     //count
     String hql = "select count(e.empId) from EmployeeInfo e";
     Query query  = session.createQuery(hql);
     List<Integer> totalNumberOfRows = query.list();
     System.out.println(totalNumberOfRows.get(0));
    
     
     
     String hql = "select max(e.empAge) from EmployeeInfo e";
     Query query  = session.createQuery(hql);
     List<Integer> totalNumberOfRows = query.list();
     System.out.println(totalNumberOfRows.get(0));
     
     
     
     String hql = "select min(e.empAge) from EmployeeInfo e";
     Query query  = session.createQuery(hql);
     List<Integer> totalNumberOfRows = query.list();
     for(int i=0;i<totalNumberOfRows.size();i++){
    	 System.out.println(totalNumberOfRows.get(i));
     }
      */
     
     String hql = "select avg(e.empSalary) from EmployeeInfo e";
     Query query  = session.createQuery(hql);
     List<Integer> avgSalary = query.list();
     System.out.println(avgSalary.get(0));
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
