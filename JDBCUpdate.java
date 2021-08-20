package com.Exam_aug20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "SYSTEM";
		String password = "leonard123";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Created");
		Statement stmt = con.createStatement();
		
		String updateQuerry = "UPDATE TABLE1 SET ID1=201 WHERE ID1 = 3";
		stmt.executeUpdate(updateQuerry);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM TABLE1");
		System.out.println("Querry Execution"+rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("ID1")+" "+rs.getString("NAME1")+" "+rs.getString("DOB"));
		}
		con.close();
	}

}
