package registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email,password;
		String name=request.getParameter("name");
		 email=request.getParameter("email");
		 password=request.getParameter("password");
		long  contact =Long.parseLong(request.getParameter("contact"));
		long  dob=Long.parseLong(request.getParameter("dob"));

	
	
	// TODO Auto-generated method stub
			try
			{
			String url="jdbc:mysql://localhost:3306/Metro";
			String uname="root";
			String pass="test";
			String query="insert into user(name,email,contact,dob,validity,passType,password) values(?,?,?,?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, uname, pass);
			PreparedStatement st=con.prepareStatement(query);
			//UserRegDao user=new UserRegDao();
			//user.getInfo();
//			st.setString(1,user.getName());
//			st.setString(2,user.getEmailId());
//			st.setLong(3,user.getDob());
//			st.setLong(4,user.getMobileNo());
//			st.setLong(5,user.getValidity());
//			st.setString(6,user.getPassType());
//			st.setString(7, user.getPassord());
			
			
			st.setString(1,name);
			st.setString(2,email);
			st.setLong(3,contact);
			st.setLong(4,dob);
			
			st.setLong(5,20180707);
			st.setString(6,"");
			st.setString(7, password);
			
			String query1="select *from user";
			
			st.executeUpdate();
			
			
			ResultSet rs=st.executeQuery(query1);
			
			while(rs.next())
			{
				String display=rs.getInt(1)+"	"+rs.getString(2)+"		"+rs.getString(3)+"		"+rs.getDate(4)+"		"+rs.getLong(5)+"	"+rs.getDate(6)+"		"+rs.getString(7)+"		"+rs.getString(8);
				System.out.println(display);
			}
			}
			catch (Exception e)
			{
				
				System.out.print(e);
			}
	
	
	}

}
