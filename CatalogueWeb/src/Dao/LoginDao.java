package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginDao {
	
	String sql = "select * from login where uname=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/catalogues?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	String username = "root";
	String password = "narutosasukegaara";
	public boolean check(String uname,String pass) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return false;
	}
}
