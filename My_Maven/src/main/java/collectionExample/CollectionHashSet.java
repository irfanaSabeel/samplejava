package collectionExample;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;

public class CollectionHashSet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<String>();
		h.add("Bike");
		h.add("Car");
		h.add("van");
		h.add("bus");
		h.add("scooter");
		
		System.out.println("using Iteration");
		Iterator<String>it=h.iterator();
		while(it.hasNext())//methods of iterator
		{
			System.out.println(it.next());
		}
		
		
		h.remove("van");
		System.out.println("after removing list:" +h);
		
		
		System.out.println("size:" +h.size());
	}

}
