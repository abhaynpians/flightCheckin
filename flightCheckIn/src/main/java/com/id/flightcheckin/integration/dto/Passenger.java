package com.id.flightcheckin.integration.dto;


public class Passenger {

	private long id;
	private String firstName;
	private String lastname;
	private String middleNmae;
	private String email;
	private String phone;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddleNmae() {
		return middleNmae;
	}
	public void setMiddleNmae(String middleNmae) {
		this.middleNmae = middleNmae;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
