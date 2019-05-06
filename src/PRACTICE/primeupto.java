package PRACTICE;

public class primeupto 
{
	public static void main(String args[])
	{    
		
		for(int a=2;a<=100;a++)
		{
			int b=a;
			int count=0;
			for(int i=2;i<b;i++)
			{
				int t=b%i;
				if(t==0)
				{
					count=1;
					break;
				}
			}
			if(count!=1)
			{
				System.out.println(b);
			}
			
			
		}
	}
}
