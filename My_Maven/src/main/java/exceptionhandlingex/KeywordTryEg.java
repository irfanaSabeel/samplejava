package exceptionhandlingex;
import java.io.IOException;

public class KeywordTryEg {
	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
int c=a+b;
System.out.println(c);

try
{
	//int sum=50/0;
	
	int arr[]=new int[20];
	 arr[25]=30;
}
	catch(ArithmeticException e)
{
	System.out.println(e);//without statement
	System.out.println("example of displaying");
}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array outofbound eception:");
	}
	
	catch(Exception e)
	{
		System.out.println("Parent exception occurs:");
	}
finally
{
	System.out.println("finally block will always executed");
}
System.out.println("exception");
	}

}
