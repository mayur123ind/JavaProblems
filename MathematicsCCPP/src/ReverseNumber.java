/*
Author : Mayur Ind.
Problem Name : Write a program to Print REVERSE of N to 1 numbers?
Purpose : Educational
*/
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : " );
		int n = sc.nextInt();
		
		for (int i = n; i >=1; i--) {
			System.out.print(" " + i);
		}
	}

}
