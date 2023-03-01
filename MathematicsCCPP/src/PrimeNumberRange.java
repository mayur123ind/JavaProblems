/*
Author : Mayur Ind.
Problem Name : Write a program to check whether the given number is PRIME or not(Efficient Method)
Purpose : Educational
*/
import java.util.*;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n =sc.nextInt();
		int count =0;
		System.out.println("Prime Numbers between 1 to "+n);
		//loop through the number one by one
		for (int i = 2; i <n ; i++) {
			boolean isPrime=true;
			//check the number is prime or not
			for (int j = 2; j< i; j++) {
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
				++count;
			}
				
		}
		System.out.println();
		System.out.println("total prime number is "+count);
	}

}
