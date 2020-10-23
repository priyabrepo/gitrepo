package basicconcepts.com.corejava;

class UseGetSet{
	
	private int value;
	
	public void setValue(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return this.value;
	}
}

class UseConstructor{
	
	private int value;
	
	UseConstructor(int value)
	{
		this.value =value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}


public class GetSetVariables {
	
	public static void main(String[] args)
	{
		UseGetSet obj1 = new UseGetSet();
		obj1.setValue(10);
		System.out.println("value by getter:"+obj1.getValue());
		
		UseConstructor obj2 = new UseConstructor(10);
		System.out.print("value by construcctor:"+obj2.getValue());
	}
}


