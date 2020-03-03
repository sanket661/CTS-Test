package com.javaTest;
//Question 4.5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question45 {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter id:");
	int emp_id=Integer.parseInt(br.readLine());
	System.out.println("Enter name:");
	String emp_name=br.readLine();
	System.out.println("Enter age:");
	int emp_age=Integer.parseInt(br.readLine());
	System.out.println("Enter designation:");
	String emp_designation=br.readLine();
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbcExample";
	Connection conn = DriverManager.getConnection(url,"root","root");
	String query="insert into user"+"(emp_id,emp_name,emp_age,emp_designation)"+" values(?,?,?,?)";
	PreparedStatement ps = conn.prepareStatement(query);
	ps.setInt(1,emp_id);
	ps.setString(2, emp_name);
	ps.setInt(3, emp_age);
	ps.setString(4, emp_designation);
		
	ps.executeUpdate();
	System.out.println("Data inserted successfully");
		
	}
}
