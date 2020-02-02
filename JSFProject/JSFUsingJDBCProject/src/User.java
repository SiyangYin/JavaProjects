import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ReferencedBean;

@ManagedBean
@ReferencedBean
public class User
{
 String userName;
 String email;
 public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean save()
{
	int result=0;
	try
	{
		/*create Database
		mysql> create database emp21;
		mysql> use emp21;
		Database changed
		mysql> create table user(id int not null auto_increment primary key,name varchar(30) not null,email varchar(50) not null);
		Query OK, 0 rows affected (0.67 sec)

		mysql>*/
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp21","root","root");
		PreparedStatement ps=con.prepareStatement("insert into user(name,email) values(?,?)");
		ps.setString(1, this.getUserName());
		ps.setString(2, this.getEmail());
		result=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	if(result == 1)
	{
		return true;
	}
	else
		return false;
}
public String submit()
{
	if(this.save())
	{
		return "response.xhtml";
	}
	else
		return "home.xhtml";
}
}
