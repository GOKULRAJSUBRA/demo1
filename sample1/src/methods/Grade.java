package methods;

public class Grade {
	public int Total(int a,int b,int c)
	{ 
		return a+b+c;
	}
	public int Average(int x,int y,int z)
	{
		return (x+y+z)/3;		
	}
	public int Maximum(int a,int b,int c)
	{
		if(a>b && a>c)
		{
		 return a;
		}
		else if(b>a && b>c)
		{
		 return b;
		}
		else if (c>a && c>b)
		{
		 return c;
		}
		return 0;
	}
}
