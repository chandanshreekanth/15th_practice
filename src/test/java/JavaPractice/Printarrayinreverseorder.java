package JavaPractice;

public class Printarrayinreverseorder
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println("Before reversing");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("After reversing");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		

		

	}

}
