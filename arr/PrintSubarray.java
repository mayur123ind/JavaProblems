package arr;

public class PrintSubarray {
	
	public static void printSubarray(int arr[]) {
		
		int total=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i ; j < arr.length; j++) {
				for (int k = i; k <= j; k++) { // print 
					System.out.print(" " + arr[k]); //sub array
				}
				++total;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total subarray : " +total);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		printSubarray(arr);
	}

}
