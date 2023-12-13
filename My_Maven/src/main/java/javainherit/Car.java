package javainherit;

public class Car extends Vehicle{

	public void display()
	{
System.out.println("Car is a four wheeler");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car();
c.display();
c.print();
	}
	

}
