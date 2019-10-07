package assignment_4_Oct;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 ,str2 = "";
		
		System.out.println("Enter the string to check whether it is palindrome or not ?");
		str1 = scan.nextLine();
		
		for(int var = str1.length() -1 ; var >= 0; var--) {
			
			str2 += str1.charAt(var);

		}
		
		if(str2.equals(str1)) {
			System.out.println("The entered String is Palindrome");
		}
		else {
			System.out.println("The entered string is not Palindrome");
		}
		
	}

}
