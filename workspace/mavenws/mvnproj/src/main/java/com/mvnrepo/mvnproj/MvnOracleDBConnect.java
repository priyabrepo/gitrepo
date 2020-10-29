package com.mvnrepo.mvnproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MvnOracleDBConnect {

	public static void main(String[] args) {

		try {
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","C##admin","admin");
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM attendance_table");
		
		boolean b = ps.execute();
		
		if (b)
		{
			System.out.println("connected");
		}
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
