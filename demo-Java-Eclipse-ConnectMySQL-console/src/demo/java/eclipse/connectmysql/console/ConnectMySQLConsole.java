package demo.java.eclipse.connectmysql.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQLConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Connection to MySQL");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error loading jdbc driver");
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost/testdb";
		String user = "testdbuser";
		String password = "dbpass";
		
		Connection con =null;
		try {
			con=DriverManager.getConnection(url, user, password);
			System.out.println("Connection to DB created");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
