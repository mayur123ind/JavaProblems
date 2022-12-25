//2 d array


import java.util.Scanner;

public class addarray

{
	public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	
	{
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		int i,j=0,k=0;
					
		System.out.println("Enter numbers of array A");

		for(i=0;i<5;++i)
		{	
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter numbers of array B");

		for(i=0;i<5;++i)
		{	
			b[i]=sc.nextInt();
		}

		System.out.println("Addition of A and B array : ");
		
		for(i=0;i<5;++i)
		{	
			
			c[i]=a[j]+b[k];
			j++;
			k++;
		}
			for(i=0;i<5;i++)
			{
				System.out.println(c[i]);
			}			
	}
 }

}
