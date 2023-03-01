/*
Author : Mayur Ind.
Problem Name : Write a program to check given number is EVEN or ODD?
Purpose : Educational
*/
import java.util.Scanner;
public class EvenOdd {
	//mad
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n%2==0)
			System.out.println(n+" number is Even");
		else
			System.out.println(n+" number is odd");
	}

}
