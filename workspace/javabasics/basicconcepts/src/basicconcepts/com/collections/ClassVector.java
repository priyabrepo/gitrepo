package basicconcepts.com.collections;

import java.util.Iterator;
import java.util.Vector;

public class ClassVector {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<String>();
				
				vec.add("one");
		        vec.add("two");
		        vec.add("three");
		        vec.add("four");
		        vec.add("five");
		        // same as Arraylist but has extra methods than collections
		  Iterator<String> itr = vec.iterator();
		  
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
	}

}
