package basicconcepts.com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassArrayList1 {

	public static void main(String[] args) {
       
		ArrayList<String> arlist = new ArrayList<String>();
		
		arlist.add("one");
		arlist.add("one");
		arlist.add("two");
		arlist.add("three");
		arlist.add("four");
		arlist.add("five");
		// can have duplicate.mentains insertion order.non-syncronised
		Iterator<String> itr = arlist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
	