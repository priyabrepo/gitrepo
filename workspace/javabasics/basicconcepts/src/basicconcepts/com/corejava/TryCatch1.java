package basicconcepts.com.corejava;

public class TryCatch1 {
	
	public static void main(String[] args)
	{
		try {
		System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException   e)
		{
			System.out.println(e.getLocalizedMessage()+" catched by ArrayIndexOutOfBoundsException ");
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e.getLocalizedMessage()+" catched by ArithmeticException");
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage()+" catched by Exception");
		}
		
		 finally{
			 System.out.println("This is finally block");
		      }  
		      System.out.println("Out of try-catch-finally");   
	}

}
