package PRACTICE;

public class noofdigits 
{
	public static void main(String[] args) 
	{
		int n=2504;int count = 0;
		while(n>0)
		{
			 int m=n%10;
			 count++;
			 n=n/10;
			
		}
		
		System.out.println(count);
		
		
		
		
	}

}
