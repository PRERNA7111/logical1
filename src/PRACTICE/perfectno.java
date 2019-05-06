package PRACTICE;

public class perfectno 
{
	public static void main(String[] args)
	{
		int n=6,sum=0;
		for(int i=1;i<n;i++)
		{
			int t=n%i;
			if(t==0)
			{
				sum=sum+i;	
			}
		}
		if(sum==n)
		{
			System.out.println(n+"is perfect no");
		}
		else
		{
			System.out.println(n+"is not perfect no");
		}
		
	}

}
