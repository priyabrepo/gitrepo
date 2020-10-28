package javaJDBC.com.firstconnection;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class FirstInsert {

	public static void main(String[] args) throws SQLException{

		 Connection con = null;
         Statement st = null;
         BufferedReader br = null;
         try {
        	 Class.forName("oracle.jdbc.OracleDriver"); 
        	  con =  DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl"
        					 ,"C##admin","admin");
        	 st = con.createStatement();
        	 br = new BufferedReader(new java.io.InputStreamReader(System.in));
        	 System.out.println("Enter Name:");
        	 String name = br.readLine();
        	 int conVal = st.executeUpdate("insert into attendance_table (name)values( '"+name+"')");
        	 System.out.println("Records entered :"+conVal);
         }catch(Exception e)
         {
        	 e.getLocalizedMessage();
         }
         finally {
			try {
				br.close();
				st.close();
				con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
