package PRACTICE;

public class spyno 
{
	public static void main(String[] args) {
		
	int a=33,sq=1,add=0;
	int temp=a;
	while(a>0)
	{
		int rem=a%10;
		 sq=sq*rem;
		 add=add+rem;
		 a=a/10;
		
	}
	if(sq==add)
	{
		System.out.println("no is spy no");
	}
	else
	{
		System.out.println("no is not spy");
	}
	}

}
