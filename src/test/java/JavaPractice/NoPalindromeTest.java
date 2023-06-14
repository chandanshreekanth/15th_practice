package JavaPractice;

import java.util.Scanner;

public class NoPalindromeTest 
{
	public static void main(String[] args)
	{
		int n=123;
		int rev=0;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println(rev+" ");
		System.out.println("the number is reverse and sum of the number is "+sum);

	}
}



