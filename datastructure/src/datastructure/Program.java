package datastructure;

import java.util.Scanner;

import exceptions.StackOverflowException;
import exceptions.StackunderflowException;

public class Program {
	static Scanner sc =new Scanner(System.in);
	
	
	public static void acceptRecord(int element[]) {
		if(element!=null)
			System.out.println("Enter Element : ");
			element[0]=sc.nextInt();
		
	}
	
	public static void printRecord(int[] element) {
		if(element != null)
			System.out.println("Pooped Element is : "+ element[0]);
		
	}
	public static int menulist() {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		System.out.println("@maddy");
		int ch;
		int element[] =new int [1];
		Stack st = new Stack(5);
		try {
			while((ch = menulist()) != 0)
			{
				switch (ch) {
				case 1:
					acceptRecord(element);
					st.push(element[0]);
					break;

				case 2:
					element[0] = st.peek();
					printRecord(element);
					st.pop();
					break;
				}
			}
		} catch (StackOverflowException e) {
			System.out.println(e.getMessage());
		} catch (StackunderflowException e) {
			System.out.println(e.getMessage());
		}
		

	}


}
