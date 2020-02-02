package hibernate.demo.com.hibernate;

public class Emp 
{
private int id;
private String name;
private PhoneNumber phoneno;
public Emp() 
{
	System.out.println("Employee Object is created");
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PhoneNumber getPhoneno() {
	return phoneno;
}
public void setPhoneno(PhoneNumber phoneno) {
	this.phoneno = phoneno;
}




}
