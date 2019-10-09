package assignment_7_Oct;

import java.util.Scanner;

public class MyFibonacci {
	
	int num1 = 0;
	int num2 = 1;
	int num, sum;
	Scanner scan = new Scanner(System.in);
	
	 int fibonacciRecursive(int n) {
	        if (n == 1 | n == 2)
	            return 1;
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }
	
	void nonRecursive() {
		System.out.println("Enter the Number :");
		num = scan.nextInt();
		
		 for (int i = 1; i <= num ; i++)
	        {
	            sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	            
	        }
		 System.out.println("The " +num+"th "+ "value of fibonacci series is :" +sum);
	}
	
	
public static void main(String[] args) {
		
		MyFibonacci ref = new MyFibonacci();
		ref.nonRecursive();
		//int num3 = ref.fibonacciRecursive(3);
	    //System.out.println("The result value of fibonacci series is : " + num3);
	
	}

}
