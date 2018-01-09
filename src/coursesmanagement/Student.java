package coursesmanagement;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 500;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freeshmen\n2 - Sophmore \n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.year = in.nextInt();
		
		setStudentID();
		
		
	}
	
	private void setStudentID() {
		id++;
		this.studentID =  year + "" + id; 
	}
	
	public void enroll() {
		do {
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance += costOfCourse;
		} 
		else {
			break;
		}
		} while (1 !=0 );
		
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance + " Euro.");
	}
	
	public void payTuition() { 
		viewBalance();
		System.out.println("Enter Your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank You for Your payment of " + payment + " Euro.");
		viewBalance();
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Year: " + year +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: " + tuitionBalance + " Euro.";
	}
}
