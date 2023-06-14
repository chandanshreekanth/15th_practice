package JavaPractice;

import java.util.Random;

public class segregation {

	public static void main(String[] args) 
	{
		String s="my name is chandan@#AB 1234";
		String apl="";
		String num="";
		String spl="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			
			if(s.charAt(i)>='1' && s.charAt(i)<='9')
			{
				
				num=num+s.charAt(i);
			}
			
			else if(s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				apl=apl+s.charAt(i);
			}
			else 
			{
				spl=spl+s.charAt(i);
			}
		}
		
		System.out.println(apl+spl+num);
		
		Random ran=new Random();
		int rand = ran.nextInt(3);
		System.out.println(rand);
		
		int rand2 = ran.nextInt(3);
		System.out.println(rand2);
	}

}
