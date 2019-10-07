package assignment_4_Oct;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 ,str2 = "";
		
		System.out.println("Enter the string to be Reversed ?");
		str1 = scan.nextLine();
		
		for(int var = str1.length() -1 ; var >= 0; var--) {
			
			str2 = str2 + str1.charAt(var);

		}
		
		System.out.println("The Reversed string is : " +str2);
	}

}
