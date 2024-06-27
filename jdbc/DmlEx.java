package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		(1)Loading driver class
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ravallika","ravallika");
		
//		(3)create statement DML----->executeUpdate();
		
		Statement stmt =conn.createStatement();
		
//		(4)execute the statement
		
//		stmt.executeUpdate("insert into ravallika values('apple',10)");
		
		stmt.addBatch("insert into ravallika values('orange',11)");
		stmt.addBatch("insert into ravallika values('lilly',12)");
		stmt.addBatch("insert into ravallika values('tulips',13)");
		stmt.addBatch("insert into ravallika values('rose',14)");
		stmt.addBatch("insert into ravallika values('jasmine',15)");
		stmt.addBatch("insert into ravallika values('cherry',16)");
		stmt.addBatch("insert into ravallika values('honey',17)");
		
		stmt.executeBatch();
		
//		(5)closing the connections.
		
		conn.close();
		
		System.out.println("Data is inserted into the table successfully");
	}
}
