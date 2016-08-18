import java.util.*;

class revvowel
{
	public static void main(String[] args)
	{
		String s="ReverseMe";
		char c;
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer();
		sb.reverse();
		String ss1=sb.toString();
		System.out.println(ss1);
		for(int i=0;i<ss1.length();i++)
		{
			c=ss1.charAt(i);
			if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
			
			}
			else
			{
				sb1.append(c);
			}
		}
		String s1=sb1.toString();
		
		System.out.println(s1);
		
	}
}