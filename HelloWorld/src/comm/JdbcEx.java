package comm;


import java.sql.*;

public class JdbcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "system");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");
while(rs.next())
{
System.out.println(rs.getString(1)+".."+rs.getInt(2)+".."+rs.getString(3));
		}
		con.close();
		}
catch(Exception e)
{
	System.out.println(e);
}
	}
}


