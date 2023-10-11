package com.studentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

class StudentUtil {
	public static void AddStudent(Scanner sc) {
		System.out.println("Enter the student id");
		int id = sc.nextInt();
		System.out.println("Enter the student name");
		String name = sc.next();
		System.out.println("Enter the student course");
		String course = sc.next();
		System.out.println("Enter the course fee");
		String fee = sc.next();

		String sql = "insert into student_data(id , name , course , fee ) values (?,?,?,?)";
		try {
			PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, course);
			ps.setString(4, fee);

			int i = ps.executeUpdate();
			if (i < 0) {
				System.out.println("Something went wrong");
			} else {
				System.out.println("Student added successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void GetStudents() {
		try {
			String sql = "select * from student_data";
			PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(sql);
			ResultSet set = ps.executeQuery();
			while (set.next()) {
				System.out.println("StudentId :" + set.getInt(1) + " StudentName :" + set.getString(2)
						+ " CourseEnrolled :" + set.getString(3) + " CourseFee :" + set.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void GetStudentById(Scanner sc) {
		try {
			System.out.println("Enter the id of student");
			int id = sc.nextInt();
			String sql = "select * from student_data where id=?";
			PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			while (set.next()) {
				System.out.println("StudentId :" + set.getInt(1) + " StudentName :" + set.getString(2)
						+ " CourseEnrolled :" + set.getString(3) + " CourseFee :" + set.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void UpdateStudent(Scanner sc) {
		try {
			System.out.println("Enter the id of student");
			int id = sc.nextInt();
			System.out.println("Enter the id of student");
			String fee = sc.next();
			String sql = "update student_info set fee=? where id=?";
			PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(sql);
			ps.setString(1, fee);
			ps.setInt(2, id);
			int i = ps.executeUpdate();
			if (i < 0) {
				System.out.println("Something went wrong");
			} else {
				System.out.println("Fee updated successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void DeleteStudent(Scanner sc) {
		try {
			System.out.println("Enter the id of student");
			int id = sc.nextInt();
			String sql = "delete from student_info where id=?";
			PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i < 0) {
				System.out.println("Something went wrong");
			} else {
				System.out.println("Student with :" + id + " deleted successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		System.out.println("Welcome to StudentManagement");

		do {
			System.out.println("Enter the option ");
			System.out.println("1.AddStudent 2.GetStudents  3.GetStudentById  4.UpdateStudent" + "5.DeleteStudent");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				StudentUtil.AddStudent(sc);
				break;
			case 2:
				StudentUtil.GetStudents();
				break;
			case 3:
				StudentUtil.GetStudentById(sc);
				break;
			case 4:
				StudentUtil.UpdateStudent(sc);
				break;
			case 5:
				StudentUtil.DeleteStudent(sc);
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue? y/n");
			res = sc.next().charAt(0);
		} while (res == 'y');
		System.out.println("Thanks for using StudentManagement Software");

	}

}
