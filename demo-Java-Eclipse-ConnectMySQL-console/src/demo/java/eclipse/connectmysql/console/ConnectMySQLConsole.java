package demo.java.eclipse.connectmysql.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQLConsole {

	public static void main(String[] args) {		
		System.out.println("Test Connection to MySQL");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
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
			
			Statement statment = con.createStatement();
			System.out.println("Statement created");
			
			//String insertSQL = "insert into items values (1, 'TEST-555')";			
			//statment.executeUpdate(insertSQL);		
			
			String sql;
		    sql = "SELECT id, name FROM items";
		    ResultSet rs = statment.executeQuery(sql);
			
		    while(rs.next()){		       
		         int id  = rs.getInt("id");
		         String name = rs.getString("name");  
		         System.out.print("ID: " + id);		        
		         System.out.println("Name" + name);
		    }		      
		    rs.close();
		    statment.close();
		    con.close();
		      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
