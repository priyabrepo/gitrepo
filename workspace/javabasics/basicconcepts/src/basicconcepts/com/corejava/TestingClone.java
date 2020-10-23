package basicconcepts.com.corejava;

 class OriginalObj implements Cloneable{

	private int id;
	private String name;
	
	
	public OriginalObj(int id, String name) {
		System.out.println("OriginalObj constructor is called..");
		this.id = id;
		this.name = name;	
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() { // toString method of onject class is overrided to print object as we want
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class TestingClone {// original

	public static void main(String[] args) {
		System.out.println("Original  object:::");
		OriginalObj o1 = new OriginalObj(1001, "KK");
		System.out.println(o1);
		
		try {
			Object obj = o1.clone();
			OriginalObj o2 =(OriginalObj)obj;
			System.out.println("Cloned  object:::");
			System.out.println(o2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
