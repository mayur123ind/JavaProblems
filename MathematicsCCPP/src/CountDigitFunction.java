/*
Author : Mayur Ind.
Problem Name : Count Digits Function
Purpose : Educational
*/
import java.util.Iterator;
import java.util.Scanner;

public class CountDigitFunction {

	private static int intcount(int n) {

		int rev=0;
		while(n>0)
		{
			n=n/10;
			rev++;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("count is "+ intcount(n));
	}

	

}
