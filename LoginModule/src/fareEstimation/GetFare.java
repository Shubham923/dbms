package fareEstimation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetFare {
	
	
	public int JDBC(String src,String dest) throws SQLException, ClassNotFoundException
	{
		
		
		String query="select *from Tickets where routeId=?";
		String url="jdbc:mysql://localhost:3306/Metro";
		String username="root";
		String pass="test";
		String result=src+dest;
		int res=Integer.parseInt(result);
		System.out.println("Here"+res);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, pass);
		PreparedStatement st=con.prepareStatement(query);
		
		st.setInt(1, res);
		
		ResultSet rs=st.executeQuery();
		
		while(rs.next())
		{
			
			return rs.getInt("ticketPrice");
		}
		return 0;
	}

}
