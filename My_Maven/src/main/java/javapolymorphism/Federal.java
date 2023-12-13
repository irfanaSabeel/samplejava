package javapolymorphism;

public class Federal extends Bank {

	float interest=9.5f;
	public void display()
	{
		System.out.println(interest+ "Interest of federal bank");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank obj=new Federal();
obj.display();
Bank b=new Bank();
b.display();
	}

}
