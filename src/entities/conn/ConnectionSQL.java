package entities.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSQL {

	public static final String USERNAME = "root";
	public static final String PASSWORD = "501020";
	public static final String DB = "jdbc:mysql://localhost:3306/db_contacts";
	
	
	public static Connection createConnectionToMySQL() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connetion = DriverManager.getConnection(DB, USERNAME, PASSWORD);
		
		return connetion;
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = createConnectionToMySQL();
		
		if(conn != null) {
			System.out.println("Connection Succeful!");
			conn.close();
		}
		
		
		
	}
		
	
	
	
	
}
