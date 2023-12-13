package collectionExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionEg {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> l=new ArrayList<String>();
l.add("apple");
l.add("orange");
l.add("pineapple");
l.add("grape");
l.add("mango");
System.out.println("List of friuts:" +l);

l.remove(2);
System.out.println("after removing list:" +l);

Collections.sort(l);
System.out.println("Sorted list of fruits:" +l);

System.out.println("fruits list using for loop: " +l);
for(int i=0;i<l.size();i++)
{
	System.out.println(l.get(i));
}
System.out.println("fruits list using for each loop: " +l);
for(String Element:l)
{
	System.out.println(Element);
}
System.out.println("using Iteration");
Iterator<String>it=l.iterator();
while(it.hasNext())//methods of iterator
{
	System.out.println(it.next());
}
System.out.println("Getting Element");
System.out.println(l.get(2));

System.out.println("Setting Element");
l.set(2,"guava");
System.out.println("Added List:" +l);

ArrayList<Integer> in=new ArrayList<Integer>();

in.add(10);
in.add(20);
in.add(30);
in.add(40);

System.out.println("List using wrapper cls:" +in);
	}

}
