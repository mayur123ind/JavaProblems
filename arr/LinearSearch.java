package arr;

import java.util.Scanner;

public class LinearSearch {
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Element ");
			arr[i] = sc.nextInt();
		}
	}
	public static void printRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}
	public static int linearSearch(int arr[],int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key)
				return i;
		}
			return -1;
		}

	public static void main(String[] args) {
		System.out.println("Enter the Size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		LinearSearch.acceptRecord(arr);
		LinearSearch.printRecord(arr);
		System.out.print("Enter key :");
		int key=sc.nextInt();
		
		int index=LinearSearch.linearSearch(arr,key);
		if(index==-1)
			System.out.println("key Not found");
		else
			System.out.println("key is at index : " +index);
	}

	

	

}
