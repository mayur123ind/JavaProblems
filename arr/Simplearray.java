package arr;

import java.util.Scanner;

public class Simplearray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Print Array ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

}
