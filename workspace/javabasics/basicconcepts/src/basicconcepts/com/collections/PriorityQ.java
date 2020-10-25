package basicconcepts.com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
        
		PriorityQueue<String> prq = new PriorityQueue<String>();
		
		prq.add("one");
		prq.add("two");
		prq.add("three");
		prq.add("four");
		prq.add("five");
		prq.add("six");
		
		System.out.println("Head :"+prq.element());
		System.out.println("Head :"+prq.peek());
		
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr=prq.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		prq.remove();
		prq.poll();
		System.out.println("after removing two elements:");  
		Iterator<String> itr1=prq.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		
	}

}
