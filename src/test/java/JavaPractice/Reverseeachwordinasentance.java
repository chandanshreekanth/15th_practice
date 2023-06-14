package JavaPractice;

public class Reverseeachwordinasentance
{

	public static void main(String[] args)
	{
		String str="Welcome to java";            //original string 
		String[] words = str.split(" ");                   //splitting string in to words
		String reverseString="";
		for(String w:words)                 //to     //java
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)           //welcome  to emoclew     now to     and now java
			{
				reverseword=reverseword+w.charAt(i);
			}

			reverseString=reverseString+reverseword+" ";         //now we gpt 1st word emoclew    ot   avaj



		}
		System.out.println(reverseString);
	}
}



