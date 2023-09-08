package entities;

import java.util.Date;

public class Contacts {
	
	private int id;
	private static String name;
	private static Date dateRegistration;
	
	
	public Contacts() {}
	public Contacts(String name, Date dateRegistration) {
		
		
		this.name = name;
		this.dateRegistration = dateRegistration;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public static Date getDateRegistration() {
		return dateRegistration;
	}
	public void setDateRegistration(Date dateRegistration) {
		this.dateRegistration = dateRegistration;
	}
	
	
}