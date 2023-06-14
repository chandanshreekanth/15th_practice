package JavaPractice;

public class ReverseaString
{
	public static void main(String[] args) 
	{
		String s="aishu";
		String rev="";
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			count++;
          rev= rev+s.charAt(i);

		}
		System.out.println(count+" "+rev);

	}

}
