package assignment_30_Sep;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		
		 for (int i = 1; i <= 10; i++)
	        {
	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	            System.out.println(sum);
	        }
	}
}
