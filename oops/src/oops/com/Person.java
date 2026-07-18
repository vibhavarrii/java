package oops.com;

public class Person {
	private String name;
	private String phonenumber;
	private String email;
	
	public Person(String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	} 
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
        return name + "#" + email + "#" + phonenumber + "#";
    }

}
