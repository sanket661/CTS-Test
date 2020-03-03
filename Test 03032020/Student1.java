package com.javaTest;
// Question 4.2
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student1 {

	
		private double mark;
		private String name;	
		
		public static void main(String[] args) {
			
			ArrayList<Student1> studs = new ArrayList<Student1>();
			
			for (int i = 0; i < 3; i++) 
			{
				studs.add(new Student1());
			}
			
			Scanner sc = new Scanner(System.in);
			double max;
			int i;
			for (i = 0; i < 3; i++) 
			{
				System.out.println("Enter name of student: ");
				studs.get(i).setName(sc.nextLine());
				System.out.println("Enter marks: ");
				studs.get(i).setMark(sc.nextDouble());
				sc.nextLine();
			}
			
			int position = 0;
			max = studs.get(0).getMark();
			
			for (i = 0; i < 3; i++) 
			{
				if (max < studs.get(i).getMark()) 
				{
					max = studs.get(i).getMark();
					position = i;
				}
			}
			System.out.println("Highest marks:" + studs.get(position).getMark() + " student name " + studs.get(position).getName());
		}
		
		public Student1() {
			mark = 0;
			name = "";
		}
		
		public Student1(int mark, String name) {
			this.mark = mark;
			this.name = name;
		}	
		
		public double getMark() {
			return mark;
		}	
		
		public String getName() {
			return name;
		}	
		
		public void setName(String name) {
			this.name = name;
		}	
		
		public void setMark(double mark) {
			this.mark = mark;
		
	    }
	
}
