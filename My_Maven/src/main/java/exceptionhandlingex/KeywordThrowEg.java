package exceptionhandlingex;

public class KeywordThrowEg {
	public static void add(int a,int b)
	{
		int sum=a+b;
		if(sum>30)
		{
		throw new ArithmeticException("sum is greater than 30:");	
		}
		else
		{
		System.out.println("sum is less than 30:");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	add(10,30);
}
catch(ArithmeticException e)
{
System.out.println(e);	
}
	}

}
