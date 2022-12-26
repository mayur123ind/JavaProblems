package arr;

public class SecondLarge {

	public static void main(String[] args) {
		int arr[] = {23,56,8,9,45,78,12,46,2,3};
		
		int fbig=arr[0];
		int sbig=arr[1];
		
		for (int i = 1; i < arr.length; i++) {
			if(fbig<arr[i]) {
				fbig=arr[i];
			}
			else if(sbig<arr[i]) {
				sbig=arr[i];
			}
		}
		System.out.println("first biggest Element : "+fbig );
		System.out.println("Second biggest Element : "+sbig);
	}

}
