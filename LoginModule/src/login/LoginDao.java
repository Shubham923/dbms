package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import registration.UserRegDao;


public class LoginDao {
	String query="select *from user where email=? and password=?";
	String url="jdbc:mysql://localhost:3306/Metro";
	String username="root";
	String pass="test";
	UserRegDao user=new UserRegDao();
	public UserRegDao check(String emailId,String password) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1,emailId);
		st.setString(2,password );
		ResultSet rs=st.executeQuery();
		
	
//		
//		while(rs.next())
//		System.out.println(rs.getString(1));
		
		
		
		if(rs.next())
		{
			user.setName(rs.getString("name"));
			user.setEmailId(rs.getString("email"));
			user.setDob(rs.getLong("dob"));
			user.setPassType(rs.getString("passType"));
			user.setPassword(rs.getString("password"));
			user.setValidity(rs.getLong("validity"));
			user.setMobileNo(rs.getLong("contact"));
			System.out.println(rs.getString(1));
			return user;
		}
		
		return null;
		
	}

}
