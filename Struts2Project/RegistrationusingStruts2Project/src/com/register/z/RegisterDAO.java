package com.register.z;
import java.sql.*;
public class RegisterDAO 
{
 public static int save(RegisterAction r)
 {
	 int x=0;
	 try
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/zijian","root","root");
		 PreparedStatement ps=con.prepareStatement("insert into reg values(?,?,?,?,?)");
		 ps.setString(1, r.getName());
		 ps.setString(2, r.getPassword());
		 ps.setString(3, r.getEmail());
		 ps.setString(4, r.getGender());
		 ps.setString(5, r.getCountry());
		 x=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return x;
 }
}
