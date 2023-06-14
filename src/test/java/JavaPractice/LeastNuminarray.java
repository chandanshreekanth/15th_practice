
package JavaPractice;

public class LeastNuminarray
{

	public static void main(String[] args)
	{
		int a[]= {20,10,50,40,30};
		int least=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<least)
			{
				least=a[i];
			}
		}
		System.out.println(least);

	}

}
