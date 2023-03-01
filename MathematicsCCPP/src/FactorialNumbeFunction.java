/*
Author : Mayur Ind.
Problem Name : Factorial Number (Function)
Purpose : Educational
*/
import java.util.Scanner;

public class FactorialNumbeFunction {

	private static int factorial(int n) {

		int fact=1;
		for (int i = 2; i <= n ; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Factorial of number is "+ factorial(n));
	}

	

}
