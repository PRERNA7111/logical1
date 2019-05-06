package PRACTICE;

public class fibonisis 
{
	public static void main(String[] args) {
		
	
	 int t=0;
	 int t1=1;
	 System.out.println(t);
	 System.out.println(t1);

	 for (int i=0;i<=4;i++)
	 {
	  int temp=t+t1;
	  System.out.println(temp);
	  t=t1;
	  t1=temp;
	  
	 }
	}
}
