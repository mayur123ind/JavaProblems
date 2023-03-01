/*
Author : Mayur Ind.
Problem Name : Write a program to display sum of 1 to N numbers
Purpose : Educational
*/
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <=num; i++) {
			sum+=i;
			System.out.println(sum +" + "+ i +" = "+ sum );
		}
	}

}
