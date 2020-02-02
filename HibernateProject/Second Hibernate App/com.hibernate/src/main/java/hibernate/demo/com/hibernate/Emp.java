package hibernate.demo.com.hibernate;

import java.util.List;

public class Emp 
{
private String id;
private String name;
private List<PhoneNumber> phoneno;

public Emp() 
{
	System.out.println("Employee Object is created");
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<PhoneNumber> getPhoneno() {
	return phoneno;
}
public void setPhoneno(List<PhoneNumber> phoneno) {
	this.phoneno = phoneno;
}

}
