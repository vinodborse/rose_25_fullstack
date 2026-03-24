package com.skillio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	private String address;
	
	@OneToOne
	private Aadhar aadhar;

	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	public User() {}
	
	public User(int id, String name, String address, Aadhar aadhar) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.aadhar = aadhar;
	}
	

	
	

}
