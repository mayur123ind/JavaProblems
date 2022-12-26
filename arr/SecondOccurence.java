//Write a program to FIND THE SECOND OCCURRENCE ELEMENT in a given array ?
package arr;

public class SecondOccurence {

	public static int secondOccur(int arr[],int key) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(key==arr[i])
				count++;
			if(count==2)
				return i;
			
		}
		return -1;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  "+ arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		 int arr[]={22,11,23,11,15,19,11};
		 int index = secondOccur(arr,11);
		 print(arr);
		 if(index>=0) 
			 System.out.println	("Second time occurred element found at the index"+index);	
		else	
			 System.out.println	("not valid");	
		 
	}

}
