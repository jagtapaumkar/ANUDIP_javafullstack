package Java_basics;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Employee ID: ");
	        String empId = sc.nextLine();

	        System.out.print("Enter Department: ");
	        String department = sc.nextLine();

	        System.out.print("Enter Designation: ");
	        String designation = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();
	        sc.nextLine(); 

	        System.out.println("\n===== Employee Details =====");
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Department: " + department);
	        System.out.println("Designation: " + designation);
	        System.out.println("Salary: " + salary);

	        sc.close();

	}

}
