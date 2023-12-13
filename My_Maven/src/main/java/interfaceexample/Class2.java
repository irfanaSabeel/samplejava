package interfaceexample;

public class Class2 implements Interface{

	public void display() 
	{	
	System.out.println("interface");
	System.out.println("Print num:" +NUM);
	}
	public void show()
	{
		System.out.println("example of interface");
	}
public void details()
{
System.out.println("Name is irfana");
}
public void print()
{
	System.out.println("Example implemnt");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Class2 c=new Class2();
    c.display();
    c.show();
    c.details();
    c.print();
	}

}
