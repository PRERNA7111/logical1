package PRACTICE;

public class primeno 
{
	public static void main(String[] args) {
		
	int a=7,count=0;
	for(int i=2;i<a;i++)
	{
		int t=a%i;
		if(t==0)
		{
			 count=1;
			break;
		}
	}

	if(count==1)
	{
		System.out.println(a+"no is not prime");
	}
	else
	{
		System.out.println(a+"  "+"no is  prime");
	}
	}

}
