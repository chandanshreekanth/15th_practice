package JavaPractice;

import java.util.Scanner;

public class Fibonacciseries
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		//int n=5;                //0,---1---,1,---2,---3,---5
		int fib1=0;             //fib1 fib2 fib3
		int fib2=1;
		int fib3=0;
		System.out.println(fib1+" "+fib2);
		for(int i=0;i<n;i++)
		{
			fib3=fib1+fib2;    //0+1=1,2,3,5,8,13
			fib1=fib2;         //1=1,1,2,3,5,8
			fib2=fib3;         //1=1,2,3,5,8
		}
		System.out.println(fib3);

	}

}
