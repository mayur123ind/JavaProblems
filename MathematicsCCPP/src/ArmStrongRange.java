/*
Author : Mayur Ind.
Problem Name : Write a Program to check the range 100 to 1000 is ARMSTRONG or not 
Purpose : Educational
*/

public class ArmStrongRange {

	public static void main(String[] args) {

		int num,ld,temp,sum=0;
		for (num = 1; num <1000; num++) {
			sum=0;
			temp=num;
			
			while (temp>0) {
				ld=temp%10;
				sum=sum+ld*ld*ld;
				temp=temp/10;
			}
			
			if(num==sum)
				System.out.println(num +" is armstrong number");
		}

	}

}
