package exceptionhandlingex;

public class KeywordThrowsEx {

	public static void sum()throws ArithmeticException
	{
		throw new ArithmeticException("example");
	}
	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
try
{
	sum();
}
catch(Exception e)
{
	System.out.println(e);
}
System.out.println("throws exception:");
	}

}
