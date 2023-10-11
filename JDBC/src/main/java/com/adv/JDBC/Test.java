package com.adv.JDBC;

// getAll getById  update  delete

//modify: insertion updation deletion : executeUpdate
//read  : executeQuery():ResultSet
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ConnectionObject{
	private static Connection con = null;
	private static final String url = "jdbc:mysql://localhost:3306/jdbclearning";
	private static final String username = "root";
	private static final String password = "root";
	public static Connection getConnection(){
		//Register driver class
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if(con==null){
				con = DriverManager.getConnection(url, username, password);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}


public class Test {
	public static void addData(){
		try {
		    String insertQuery ="insert into employee_info values (102,'Rahul','Development')";
			Statement stmt =ConnectionObject.getConnection().createStatement();
			int i = stmt.executeUpdate(insertQuery);
			if(i>0){
				System.out.println("Data added successfully");
			}else{
				System.out.println("Data insertion failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void getAll(){
		try {
			Statement stmt =ConnectionObject.getConnection().createStatement();
			String sql = "select * from employee_info";
			ResultSet set = stmt.executeQuery(sql);
			while(set.next()){
				System.out.println("EmpName :"+set.getInt(1)+
						"EmpName :"+set.getString(2)+
						"DeptName :"+set.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getById(){
		
		try {
			Statement stmt =ConnectionObject.getConnection().createStatement();
			String sql = "select * from employee_info where empId=102";
			ResultSet set = stmt.executeQuery(sql);
			System.out.println();
			System.out.println("Fetching data based on Id");
			while(set.next()){
				System.out.println("EmpName :"+set.getInt(1)+
						" EmpName :"+set.getString(2)+
						" DeptName :"+set.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updateEmployee(){
		try {
			Statement stmt =ConnectionObject.getConnection().createStatement();
			String sql = "update employee_info set deptName='Testing' where empId=102";
			stmt.executeUpdate(sql);
			System.out.println("Data updated successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteById(){
		try {
			Statement stmt =ConnectionObject.getConnection().createStatement();
			String sql = "delete from employee_info where empId = 102";
			stmt.executeUpdate(sql);
			System.out.println("data deleted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    
	public static void main(String[] args) {
//		Test.addData();
//		Test.getAll();
		//Test.getById();
		
//		Test.getAll();
//		Test.updateEmployee();
//		Test.getAll();
		
		
		Test.getAll();
		Test.deleteById();
		Test.getAll();
		
	}

}
