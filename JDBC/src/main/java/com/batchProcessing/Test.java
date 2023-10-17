package com.batchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class ConnectionUtil {
	private static Connection con = null;
	private static final String url = "jdbc:mysql://localhost:3306/jdbclearning";
	private static final String username = "root";
	private static final String password = "root";

	public static Connection getConnection() {
		// Register driver class
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (con == null) {
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
   public static void addStudent(){
	   try{
	   Statement stmt =ConnectionUtil.getConnection().createStatement();
	   String sql = "insert into student_data values(102,'Rahul','Python',30000)";
	   String sql2 = "insert into student_data values(103,'Amit','DataScience',50000)";
	   String sql3 = "insert into student_data values(104,'Vivek','WebDevelopment',30000)";
	   
	   stmt.addBatch(sql);
	   stmt.addBatch(sql2);
	   stmt.addBatch(sql3);
	   
	   int[] arr = stmt.executeBatch();
	   if(arr.length>0){
		   System.out.println("Data added successfully");
	   }else{
		   System.out.println("Something went wrong");
	   }
	
	   }catch(Exception e){
		   e.printStackTrace();
	   }
   }
   
   
   public static void addStudentUsingPS(Scanner sc){
	   try {
		char res;
		String sql = "insert into student_data values(?,?,?,?)";
		PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(sql);
		do{
			System.out.println("Enter the student id:");
			int id = sc.nextInt();
			System.out.println("Enter the student name:");
			String name = sc.next();
			System.out.println("Enter the course name:");
			String course = sc.next();
			System.out.println("Enter the fee");
			String fee = sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, course);
			ps.setString(4, fee);
           
			ps.addBatch();
		
		    System.out.println("Do you want to continue? - y/n");
		res = sc.next().charAt(0);
		}while(res=='y');
		
		 ps.executeBatch();
		 System.out.println("Data saved successfully");	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
	public static void main(String[] args) {
		//Test.addStudent();
		Scanner sc = new Scanner(System.in);
		Test.addStudentUsingPS(sc);

	}

}
