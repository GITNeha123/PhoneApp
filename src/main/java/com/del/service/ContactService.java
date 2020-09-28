package com.del.service;

import java.util.List;

import com.del.command.Contact;

public interface ContactService {
	public  boolean saveContact(Contact contact);	
	public  List<Contact> getAllContacts();
	public Contact getContactById(Integer cid);
	public  boolean updateContact(Contact contact);	
	public void deleteContactById(Integer cid);
	
	

}
