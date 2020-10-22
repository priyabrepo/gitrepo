package basicconcepts.com.corejava;

public class PoolAndEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = new String("PRIYABRATTA");
	      String s2 = new String("PRIYABRATTA");
	      //Reference comparison
	      System.out.println(s1 == s2); //POINTED TO DIFFRENT OBJECTS
	      //Content comparison
	      System.out.println(s1.equals(s2)); //CHECKING REFERANCE AND QUALITY
	      // integer-type
	      System.out.println(10 == 10); 
	      // char-type
	      System.out.println('a' == 'a');  // POINTED TO SAME POOL MEMORY
	      
	      String s3 = "priyab";
	      String s4 = "priyab";
	      System.out.println(s3 == s4); //pooled and pointed to same memory location
	      System.out.println(s3.equals(s4));//pooled and pointed to same memory location
	      
	}

}
