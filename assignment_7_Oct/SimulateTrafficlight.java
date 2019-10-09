package assignment_7_Oct;

import java.util.Scanner;

public class SimulateTrafficlight {

	
	Scanner scan = new Scanner(System.in);
	
	void myTrafic(char ch) {
		
		while(ch == 'y'){

			System.out.println();
			System.out.println("Please select from the choices given below : ");
			System.out.println("1. RED ");
			System.out.println("2. Yellow ");
			System.out.println("3. Green ");
			System.out.println();
			int color = scan.nextInt();
			
			switch (ch) {
			case 'y':
				switch (color) {
					case 1:{
						System.out.println("STOP");
						System.out.println();
						}
						break;
			
					case 2:{
						System.out.println("READY");
						System.out.println();
						}
					break;
			
					case 3:{
						System.out.println("GO");
						System.out.println();
						}
					break;

					default:{
						System.out.println();
						System.out.println("Please choose from the given options.");
						System.out.println();
					}
		
					break;
				}
				
				System.out.println("If you want to Continue Enter y otherwise n");
				ch = scan.next().charAt(0);
				break;
		}
		
	}
		System.out.println("Thanks for Using our System...");
}
		
	
	public static void main(String[] args) {
		
		SimulateTrafficlight ref = new SimulateTrafficlight();
		ref.myTrafic('y');

	}

}
