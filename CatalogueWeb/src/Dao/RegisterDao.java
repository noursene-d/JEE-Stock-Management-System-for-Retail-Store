package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class RegisterDao {
	
	String sql = "INSERT INTO login" + "  (uname, pass, email, firstName, lastName, address) VALUES " + " (?, ?, ?, ?,?,?);";
	String url = "jdbc:mysql://localhost:3306/catalogues?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	String username = "root";
	String password = "narutosasukegaara";
	
	public int registerUser(String uname,String pass, String email, String firstName, String lastName, String address) throws Exception {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			st.setString(3, email);
			st.setString(4, firstName);
			st.setString(5, lastName);
			st.setString(6, address);
			System.out.println(st);
			result = st.executeUpdate();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	
	
}
