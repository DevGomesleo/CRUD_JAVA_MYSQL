package application;

import java.util.Date;

import entities.Contacts;
import entities.dao.ContactsDao;

public class Main {

	public static void main(String[] args) {
		ContactsDao contactDao = new ContactsDao();
		Contacts contact = new Contacts("leo", new Date());
		
		contactDao.save(contact);
		

	}

}
