package superkeywordex;

public class SuperClassB extends SuperClassA{

	public SuperClassB(float a,float b) 
	{
	    super(10,8);
		float c=a+b;
	    System.out.println("sum is:" +c);
	}
public void display()
{
	super.display();
	System.out.println("Child class method");
	System.out.println(super.var);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperClassB obj=new SuperClassB(10.5f,8.5f);
obj.display();
	}

}
