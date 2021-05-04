package Entities;

public class Gamer {
	int id;
	String firstName;
	String lastName;
	String nationaltiyId;
	String dateOfBirth;
	
	public Gamer() {
		
		
	}
	public Gamer(int id, String firstName, String lastName, String nationaltiyId, String dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltiyId = nationaltiyId;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationaltiyId() {
		return nationaltiyId;
	}
	public void setNationaltiyId(String nationaltiyId) {
		this.nationaltiyId = nationaltiyId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
