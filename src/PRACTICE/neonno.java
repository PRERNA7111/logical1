package PRACTICE;

public class neonno 
{
	public static void main(String args[])
	{
		int a=10;
		int b=a*a;
		int c=0;
		while(b>0)
		{
			int t=b%10;
		    c=c+t;
		    b=b/10;
		}
		if(c==a)
		{
			System.out.println(a+"no is neon no");
		}
		else
		{
			System.out.println(a+"no is not neon");
		}
		
	}

}
