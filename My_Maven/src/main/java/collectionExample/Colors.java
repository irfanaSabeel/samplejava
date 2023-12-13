package collectionExample;
import java.util.ArrayList;
import java.util.Iterator;


public class Colors {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c=new ArrayList<String>();
		c.add("Red");
		c.add("Orange");
		c.add("Yellow");
		c.add("Green");
		c.add("Blue");
		System.out.println( "list of colors:" +c);

		System.out.println("Retrieve an element: ");
		System.out.println(c.get(3));

		System.out.println("using Iteration");
	    Iterator<String> a=c.iterator();
		while(a.hasNext())
		{
		System.out.println(a.next());
		}

		c.remove(2);
		System.out.println("Remove third element" +c);

		System.out.println("display after search element");
		System.out.println(c.contains("Green"));
	}

}
