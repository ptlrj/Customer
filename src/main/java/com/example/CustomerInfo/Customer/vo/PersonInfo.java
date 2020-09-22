package com.example.CustomerInfo.Customer.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "`personalinfo`")
public class PersonInfo {
	
	private int id;
	
	@NotNull(message="First name cannot be null.")
	@Size(min = 3)
	private String  firstName;
	
	@NotNull(message="Last name cannot be null.")
	@Size(min = 3)
	private String	lastName;
	
	@Size(min = 1)
	private String  middleName;
	
	@NotNull(message="Gender cannot be null.")
	@Size(min = 1)
	private String  gender;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="`personId`")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="`firstName`")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="`lastName`")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="`middleName`")
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Column(name="`gender`")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
