package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DdlEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading driver class
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ravallika","ravallika");
		
//		(3)create statement
		
		Statement stmt = conn.createStatement();
		
		
//		(4)execute the statement  DDL --->execute();
		
		stmt.execute("create table ravallika(name varchar2(10),id number(10))");
		
//		(5)closing the connections.
		
		conn.close();
		
		System.out.println("Table is created");
		
	}
}
