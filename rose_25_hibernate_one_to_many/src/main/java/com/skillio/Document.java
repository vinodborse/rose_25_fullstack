package com.skillio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Document {
	@Id
	private int id;
	private String type;
	private String doc_number;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDoc_number() {
		return doc_number;
	}
	public void setDoc_number(String doc_number) {
		this.doc_number = doc_number;
	}
	public Document() {}
	
	public Document(int id, String type, String doc_number) {
		this.id = id;
		this.type = type;
		this.doc_number = doc_number;
	}
	
	

}
