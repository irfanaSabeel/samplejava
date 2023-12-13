package exceptionhandlingex;

public class CustomTest {
	public static void validate(int age)throws CustomExceptnEg
	{
	if(age<18)
	{
		throw new CustomExceptnEg("License is not permmitted");
	}
	else
	{
		System.out.println("License permitted:");
	}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	validate(20);
}
catch(CustomExceptnEg e)
{
System.out.println(e);	
}
	}

}
