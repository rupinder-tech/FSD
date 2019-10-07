package assignment_30_Sep;

import java.util.Scanner;

public class AddThreeNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int []num = new int[3];
		int count = 0;
		int sum;
		
		System.out.println("Enter any Three Numbers:");
		
		for(int i = 0;i< num.length; i++ ) {
			num[i] = scan.nextInt();
		}
		
		if(num[0] >= 40) {
			count++;
		}

		if(num[1] >= 40) {
			count++;
		}
		
		if(num[2] >= 40) {
			count++;
		}
		
		 sum = num[0] + num[1] + num[2];
		
		if(sum >= 125) {
			count++;
		}

		if(count == 4) {
			System.out.println("PASSING");
		}	
		
		if(count < 4) {
			System.out.println("FAILING");
		}	
	}

}
