package JavaPractice;

public class DescendingOrder
{
	public static void main(String[] args)
	{
		int a[]= {20,10,50,30,40};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]+" ");
		}
		System.out.println(" ");
		for(int l=a.length-1;l>=0;l--)
		{
			System.out.println(a[l]);
		}

	}

}
