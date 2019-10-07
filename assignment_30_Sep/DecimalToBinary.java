package assignment_30_Sep;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int decm ;
		int []binary = new int[100];
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number :");
		decm = scan.nextInt();
		
		while(decm >0) {
			
			binary[i] = decm % 2;
			decm = decm/2;
			i++;
		}
		for(int j = i - 1; j >= 0; j--) {
			
			System.out.println(binary[j]);
		}
		
		
		
		
	}

}
