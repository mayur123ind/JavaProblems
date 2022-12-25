package arr;

public class MaxSubarray {
	
	public static void maxSub(int[] arr) {
		int currentsum=0;
		int maxsum=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				currentsum=0;
				for (int k = i; k <= j; k++) {
					currentsum += arr[k];
				}
				System.out.println(currentsum);
				if(maxsum < currentsum)
					maxsum=currentsum;
			}
		}
		System.out.println("max sum = "+maxsum);
	}
	
	public static void main(String[] args) {
		 
		int arr[] = {1,-2,6,-1,3};
		maxSub(arr);
	}

}
