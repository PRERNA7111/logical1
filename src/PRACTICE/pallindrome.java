package PRACTICE;

public class pallindrome 
{
	public static void main (String args[])
	{
		int a=121,sum = 0,rem;
		while(a>0)
		{
			 rem=a%10;
			 sum=sum*10+rem;
			 a=a/10;
		}
		if(sum==a)
		{
			System.out.println("no is pallindrome");
		}
		else
		{
			System.out.println("no is not pallindrome");
		}
	}

}
