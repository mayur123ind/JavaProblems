package arr;

import java.util.Scanner;

public class SimpleArrayMethods {
	static Scanner sc =new Scanner(System.in);
	
	public static void acceptRecord(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" Enter Element : ");
			arr[i]=sc.nextInt();
		}			
	}

	public static void printRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		int arr[] =new int[3];
		SimpleArrayMethods.acceptRecord(arr);
		SimpleArrayMethods.printRecord(arr);

	}



	
}
