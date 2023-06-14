package JavaPractice;

public class ToFindLargestNum
{
	public static void main(String[] args)
	{
		int a[]= {20,10,50,40,30};
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
            if(a[i]>largest)
            {
            	largest=a[i];
            }

		}
		System.out.println(largest);

	}
}
