package assignment_7_Oct;

import java.util.Scanner;

public class PrimeNumber {
	
	int num;
	int n = 0, i = 0;
	String primeNumbers = "";
	Scanner scan = new Scanner(System.in);
	
	void getNumber() { 
		
	System.out.println("Enter any Number:");
    num = scan.nextInt();
    scan.close();
    
    for (i = 1; i < num/2; i++)  	   
    { 		 		  
       int counter=0; 		  
       for(n = i; n >= 1; n--)
       {
	    if(i%n == 0)
	    {
		counter = counter + 1;
	    }
	 }
       
	 if (counter == 2)
	 {
	    primeNumbers = primeNumbers + i + " ";
	 }	
   }	
    System.out.println("Prime numbers are :" +primeNumbers);
 }

	public static void main(String[] args) {
		
		PrimeNumber ref = new PrimeNumber();
		ref.getNumber();
		
	}

}
