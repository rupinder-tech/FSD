package assignment_7_Oct;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class EmployeeSalary {
	
	int salary ;
	Scanner scan = new Scanner(System.in);
	
	void checkSalary() {
		
		System.out.println("Enter the Salary of Employee: ");
		salary = scan.nextInt();
		
		if(salary < 3000) {
			
			try {
				throw new EmployeeException();
			} 
			catch (EmployeeException e) {
				e.myException();
			}
		}
		else {
			System.out.println("The Salary of the Employee is : " + salary);
		}
	}

	public static void main(String[] args) {
		
		EmployeeSalary ref = new EmployeeSalary();
		ref.checkSalary();

	}

}
