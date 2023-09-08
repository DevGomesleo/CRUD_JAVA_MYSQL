package entities;

import java.util.Date;

public class Contacts {
	
	private int id;
	private String name;
	private Date dateRegistration;
	
	
	public Contacts() {}
	public Contacts(int id, String name, Date dateRegistration) {
		
		this.id = id;
		this.name = name;
		this.dateRegistration = dateRegistration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public Date getDateRegistration() {
		return dateRegistration;
	}
	public void setDateRegistration(Date dateRegistration) {
		this.dateRegistration = dateRegistration;
	}
	
	
}