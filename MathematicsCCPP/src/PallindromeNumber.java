/*
Author : Mayur Ind.
Problem Name : check number is Pallindrome or not
Purpose : Educational
*/
import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		int rev =0 ,digit;
		System.out.println("Enter the Number");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp= n;
		
		while(n>0)
		{
			digit= n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		
		if(rev==temp)
			System.out.println("number is pallindreome");
		else
		System.out.println("number is not pallindreome");
	}

}
