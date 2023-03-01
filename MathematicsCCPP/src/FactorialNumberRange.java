/*
Author : Mayur Ind.
Problem Name : Write a program to find the FACTORIAL of a given RANGE of numbers
Purpose : Educational
*/
import java.util.*;
public class FactorialNumberRange {
	public static int fact(int n) {
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Factorial range Number");
		int n =sc.nextInt();
		
		for (int i = n; i >=1; i--) {
			System.out.println(i +" ->"+fact(i));
		}
	}

}
