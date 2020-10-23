package basicconcepts.com.corejava;

class SupperClass
{
	int z;
	
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
	   
	   public void display() {
		      System.out.println("This is the display method of superclass");
		   }
}

public class Inheritance extends SupperClass //extends
{
	 public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z);
	   }
	 public void display() {
	      System.out.println("This is the display method of subclass");
	   }
	 public void my_method() {
		 Inheritance demo = new Inheritance();
		 
		 demo.display(); // sub
	     this.display(); // sub
	     super.display(); // supper
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		Inheritance demo = new Inheritance(); //instanciated.
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.multiplication(a, b);
	      
	      demo.my_method();
	      
	     // super(); invokes super class constructor
	      //this(); invokes same class default constructor
	      

	}

}
