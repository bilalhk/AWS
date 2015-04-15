package users;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class User {
	
	private String firstName;
	private String lastName;
	
	public User(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	public User() {}
		
	public String getFirstName() {return firstName;}
	
	public String getLastName() {return lastName;}
	
	public void setFirstName(String name) {firstName = name;}
	
	public void setLastName(String name) {lastName = name;}
}
