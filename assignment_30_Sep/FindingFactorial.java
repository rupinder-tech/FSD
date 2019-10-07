package assignment_30_Sep;

import java.util.Scanner;

public class FindingFactorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int fact;
		int result = 1;
		
		System.out.print("Enter the Number :");
		fact = scan.nextInt();
		
		for (int i = 1; i <= fact; i++) {
			   result = result * i;
			}
		System.out.println("The Factorial of Number is : " + result);
		scan.close();

	}
	

}
