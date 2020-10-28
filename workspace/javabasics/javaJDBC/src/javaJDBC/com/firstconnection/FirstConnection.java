package javaJDBC.com.firstconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step1 load the driver class  
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","C##admin","admin");
			//step2 create  the connection object  
			
			Statement st = con.createStatement();
			//step3 create the statement object 
			
			ResultSet rs=st.executeQuery("select * from EMPLOYEE_DETAILS");  
			//step4 execute query  
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)
				+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)
				+"  "+rs.getString(7)+"  "+rs.getString(8)+"  "+rs.getString(9)+"  "+rs.getString(10)+"  "+rs.getString(11)
				);  
			
			con.close(); 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
