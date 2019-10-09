package assignment_7_Oct;

import java.util.Scanner;

class MyException extends Exception{
	
	void myException(){
		System.out.println("Age should be Greater than 15");
	}
	
}

public class AgeValidation {

	int age ;
	Scanner scan = new Scanner(System.in);
	
	void checkAge() throws MyException {
		
		System.out.println("Enter the Age of Employee: ");
		age = scan.nextInt();
		
		if(age < 15) {
			try {
				throw new MyException();
			}
			catch (MyException e) {
				e.myException();
			}
		}
		
		else {
			System.out.println("The age of the Employee is : " +age);
		}
	}
	
	public static void main(String[] args) {
		
		AgeValidation ref = new AgeValidation();
		try {
			ref.checkAge();

		}catch (MyException e) {
				e.myException();
		}
		
	}

}
