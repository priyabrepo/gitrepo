package basicconcepts.com.corejava;

public class SequenceOfExecution {

	static{//static block
	      System.out.println("Hello this is a static block");
	   }
	SequenceOfExecution(){//constructor
	      System.out.println("Hello this a constructor");
	   }
	   public static void demo() {// instance method
	      System.out.println("Hello this is an instance method");
	   }
	   public static void main(String args[]){//main
	      new SequenceOfExecution().demo();// calling instance method
	      //constructor is called only by new key word.
	   }

}
