/*
Author : Mayur Ind.
Problem Name : Factorial Number Recursive (Function)
Purpose : Educational
*/
import java.util.Scanner;
public class FactorialNumber_Recusive {

	public static int factRecursion(int n) {
		if (n==0)
			return 1;
		return n*factRecursion(n-1);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println("Factorial of number is " + factRecursion(n)); 
	}

}
