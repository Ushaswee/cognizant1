package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertPrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "system");
			PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?)");
			
			stmt.setString(1,"sfdg");
			stmt.setInt(2,4);
			stmt.setString(3,"khkjhds");
			int i=stmt.executeUpdate();
			System.out.println(i+"records inserted");
					con.close();
					}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

}
