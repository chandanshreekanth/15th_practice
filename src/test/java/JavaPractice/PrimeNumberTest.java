package JavaPractice;

import java.util.Scanner;

public class PrimeNumberTest
{
	public static void main(String[] args) 
	{
		int n=1;
		boolean prime = true;
		for(int i=2;i<n;i++)
		{
			if(i%n==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
		{
			System.out.println(n+" the number is prime");
		}
		else
		{
			System.out.println(n+" the number is not prime");
		}
					
		
	}

}
