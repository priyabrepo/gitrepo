package corejava.com.basics;

public class TernaryOpr {
	
	int a,b;
	TernaryOpr(int i)
	{
		a =i;
		b= (a>5)?20:30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TernaryOpr obj = new TernaryOpr(1);
		System.out.print(obj.a +" , "+obj.b);

	}

}
