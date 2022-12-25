package arr;

import java.util.Scanner;

public class BinarySearchArray {
	static Scanner sc = new Scanner(System.in);
	public static void inputRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Element : ");
			arr[i] = sc.nextInt();
		}
	}
	public static void outputRecord(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int binarySearch(int arr[],int key)
	{
		int start=0,end=arr.length-1;
		for (; start <= end; ) {
			
			int mid=(start+end)/2;
			
			//comparison
			if(arr[mid]==key)
				return mid;
			
			if(arr[mid]<key) //right
				start=mid+1;
			else          //left
				end=mid-1;
				
		}
		return -1;
	}
	public static void main(String[] args) {
	System.out.println("Enter th size of Array : ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	inputRecord(arr);
	outputRecord(arr);
	System.out.print("Enter Key : ");
	int key = sc.nextInt();
	
	int index= binarySearch(arr,key);
	if(index==-1)
		System.out.println("key Not found");
	else
		System.out.println("key is at index : " +index);
	}

	

}
