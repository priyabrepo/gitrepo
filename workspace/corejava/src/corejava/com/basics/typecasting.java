package corejava.com.basics; 

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=10;
		double v2 = 10;
		
		int v3 =(int)v2;
		double v4 = (double)v1;
		System.out.println("int "+v1);
		System.out.println("double "+v2);
		System.out.println("int casted from double "+v3); //type casted
		System.out.println("double casted from int "+v1); // double can contain int
		
		//string <-> int
		
		String s1 ="hello";
		String s2 ="10";
		String s3 ="10.0";
		//int i1 = Integer.parseInt(s1);//number format exception -runtime
		//System.out.println("character string as intiger :"+i1);
		
		int i2 = Integer.parseInt(s2);
		System.out.println("character string as intiger :"+i2);
		//int i3 = Integer.parseInt(s3);//number format exception -runtime
		
	}

}
