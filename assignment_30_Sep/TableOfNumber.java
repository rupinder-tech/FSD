package assignment_30_Sep;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {

		int var;
		int limit;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		var = scan.nextInt();
		System.out.println("Enter the limit of table : ");
		limit = scan.nextInt();
		
		for(int i = 1; i <= limit; i++) {
			 
			int result = var * i;
		
			System.out.println(var +" * " + i + " = " + result  );
		}
	}
}
