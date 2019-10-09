package assignment_7_Oct;

import java.util.Scanner;

class NameException extends Exception{
	
	void nameException() {
		System.out.println("The Employee's First or Last Name should not be empty.");
	}
}

public class EmployeeNameException {
	
	String firstName;
	String lastName;
	Scanner scan = new Scanner(System.in);
	
	void getName() {
		
		System.out.println("Enter the First Name of Employee : ");
		firstName = scan.nextLine();
		System.out.println("Enter the Last Name of Employee : ");
		lastName = scan.nextLine();
		
		if(firstName.isEmpty() || lastName.isEmpty()) {
			
			try {
				throw new NameException();
				
			} catch (NameException e) {
				e.nameException();
			}
			
		}
		else {
			System.out.println("The Employee's Fullname is: " +firstName +lastName);
		}

	}
	

	public static void main(String[] args) {
		
			EmployeeNameException ref = new EmployeeNameException();
			ref.getName();
	}

}
