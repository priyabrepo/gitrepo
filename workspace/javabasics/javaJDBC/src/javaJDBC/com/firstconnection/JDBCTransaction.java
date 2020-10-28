package javaJDBC.com.firstconnection;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBCTransaction {

	public static void main(String[] args) {
		try{  
			  
			Class.forName("oracle.jdbc.OracleDriver");
	    	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","C##admin","admin");
			con.setAutoCommit(false);  
			  
			PreparedStatement ps=con.prepareStatement("INSERT INTO ATTENDANCE_TABLE (NAME)VALUES( ?)");  
			  
			BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));  
			while(true){  
			  
			
			System.out.println("enter name");  
			String name=br.readLine();  
			  
			
			ps.setString(1,name);  
			ps.executeUpdate();  
			  
			System.out.println("commit/rollback");  
			String answer=br.readLine();  
			if(answer.equals("commit")){  
			con.commit();  
			}  
			if(answer.equals("rollback")){  
			con.rollback();  
			}  
			  
			  
			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n")){  
			break;  
			}  
			  
			}  
			con.commit();  
			System.out.println("record successfully saved");  
			  
			con.close();//before closing connection commit() is called  
			}catch(Exception e){System.out.println(e);}  

	}

}
