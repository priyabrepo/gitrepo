package basicconcepts.com.corejava;

 class MyClass{
	int x;
	MyClass()//constructor without patrams
	{
		 x =10;
	}
	
	MyClass(int i)//parameterised  constructor 
	{
		 x =i;
	}
}

public class ConstructorClass {

	
	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass();		
		System.out.println(obj1.x);
		MyClass obj2 = new MyClass(20);
		System.out.print(obj2.x);

	}

}
