package basicconcepts.com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassLinkedList {

	public static void main(String[] args) {

		LinkedList<String> lnkdlist = new LinkedList<String>();
		
		lnkdlist.add("one");
		lnkdlist.add("two");
		lnkdlist.add("three");
		lnkdlist.add("four");
		lnkdlist.add("five");
		// can have duplicate.mentains insertion order.non-syncronised
		// faster than arraylist
		
		Iterator<String> itr = lnkdlist.listIterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
		
	}

}
