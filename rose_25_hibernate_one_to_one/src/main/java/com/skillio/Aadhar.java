package com.skillio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	
	@Id
	private int id;
	private int aad_number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAadhar_number() {
		return aad_number;
	}
	public void setAadhar_number(int aad_number) {
		this.aad_number = aad_number;
	}
	
	public Aadhar() {}
	
	public Aadhar(int id, int aad_number) {
		this.id = id;
		this.aad_number = aad_number;
	}
	
	
}
