/*
Author : Mayur Ind.
Problem Name : check number is Pallindrome or not Function
Purpose : Educational
*/
import java.util.Scanner;

public class PallindreomeFunction {

	public static Boolean Pallindrome(int n) {
		int rev =0 , digit;
		int temp = n;
		
		while(n>0)
		{
			digit = n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if (temp==rev) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		System.out.println(Pallindrome(n)); 

	}

}
