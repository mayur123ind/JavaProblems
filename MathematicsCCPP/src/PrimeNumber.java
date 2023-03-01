/*
Author : Mayur Ind.
Problem Name : Write a program to check whether the given number is PRIME or not
Purpose : Educational
*/

import java.util.Scanner;

public class PrimeNumber {

	private static boolean prime(int n) {

		if(n==1)
			return false;
		for (int i = 2; i < n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
	
	 	if(prime(n)==true)
	 		System.out.println("Prime");
	 	else
	 		System.out.println("not prime");
	}

	

}
