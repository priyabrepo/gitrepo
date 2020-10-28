package javaJDBC.com.firstconnection;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadImage {

	public static void main(String[] args) {

     try {
    	 
    	 Class.forName("oracle.jdbc.OracleDriver");
    	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","C##admin","admin");
    	 
    	 PreparedStatement ps = con.prepareStatement("SELECT * FROM attendance_table");
    	 ResultSet rs = ps.executeQuery();
    	 
    	 if(rs.next())
    	 {
    		Blob b = rs.getBlob(2);//2 is column index
    		
    		byte[] barr = b.getBytes(1, (int)b.length());
    		FileOutputStream fout =  new FileOutputStream("C:\\Priyabratta");
    		fout.write(barr);// allow writing permeation in defender
    		fout.close();
    		System.out.println("download complete");
    		con.close();
    	 }
    	 
     }catch(Exception e)
     {
    	 e.printStackTrace();
     }

	}

}
