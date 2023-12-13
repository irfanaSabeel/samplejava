package javainherit;

public class Accountant extends Sales {
	int id=01;
	String name="irfana";
public void details()
{
	System.out.println("id "+id);
	System.out.println("name"+name);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accountant a=new Accountant();
a.details();
a.print();
a.display();

	}

}
