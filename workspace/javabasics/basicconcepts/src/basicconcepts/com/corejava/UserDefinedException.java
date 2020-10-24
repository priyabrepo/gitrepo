package basicconcepts.com.corejava;

class CostumeExceptionClass extends Exception{
	
	private String ce;
	CostumeExceptionClass(String ce)
	{
		this.ce=ce;
	}
	
	public String toString()
	{
		return "Costume exception :"+ce;
	}
}
public class UserDefinedException {

	public static void main(String[] args) {

		try {
			System.out.println("inside try");
			
			throw new CostumeExceptionClass("Costume exception called.");
		}catch(CostumeExceptionClass ce)
		{
			System.out.println("Catch Block") ;
			System.out.println(ce) ;
		}
	}

}
