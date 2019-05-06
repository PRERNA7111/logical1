package PRACTICE;

public class armstrongno 
{
	public static void main(String[] args) 
    {   
		int n=153,t=0;
		int m=n;
		while(n>0)
		{	
		int a=n%10;
		int s=(a*a*a);
		t=t+s;
		n=n/10;
		}
		//System.out.println(t);
		if(m==t)
		{
			System.out.println("armstrong no");
		}
		else if(m!=t)
		{
		System.out.println("not armstrong");	
		}
		
		
		
		
	}

}
