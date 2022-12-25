package arr;

import java.util.Scanner;

public class LargestNumberArray {
	static Scanner sc = new Scanner(System.in);
	
	public static void inputRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Element :");
			arr[i]=sc.nextInt();
		}
	}
	public static void displayRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int largestNum(int arr[]) {
		int large = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(large < arr[i]) 
				large = arr[i];
		}
		return large;
	}
	public static int smallestNum(int arr[]) {
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(small > arr[i]) 
				small = arr[i];
		}
		return small;
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		inputRecord(arr);
		LargestNumberArray.displayRecord(arr);
		
		System.out.println("Largest value is : " +largestNum(arr));
		System.out.println("Smallest value is : " +smallestNum(arr));
	}
}
