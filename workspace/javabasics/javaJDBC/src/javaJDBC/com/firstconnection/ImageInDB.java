package javaJDBC.com.firstconnection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageInDB {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","C##admin","admin");
			
			PreparedStatement ps = con.prepareStatement("insert into attendance_table values(?,?)");
			ps.setString(1, "hello");// 1- index."hello"- value index 1
			
			FileInputStream fis = new FileInputStream("C:\\Priyabratta\\myRepo\\gitrepo\\workspace\\javabasics\\javaJDBC\\dp.png");
			ps.setBinaryStream(2, fis, fis.available());
			
			int i = ps.executeUpdate();
			System.out.println(i+" records updated");
			
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
