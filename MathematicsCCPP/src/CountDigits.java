/*
Author : Mayur Ind.
Problem Name : Count Digits
Purpose : Educational
*/

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int rev =0;
		
		while(n>0)
		{
			n=n/10;
			rev++;
		}
		System.out.println("Count of numbers is "+ rev);
	}

}
