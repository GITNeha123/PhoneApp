package com.del.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.DAO.ContactDAOImpl;
import com.del.DAO.ContactDetailsEntity;
import com.del.command.Contact;


@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactDAOImpl Contactdao;

	@Override
	public boolean saveContact(Contact contact) {
		//  this method is used to save recrods
		ContactDetailsEntity entity =new ContactDetailsEntity();
		BeanUtils.copyProperties(contact, entity);
		ContactDetailsEntity saveEntity=Contactdao.save(entity);
		
		return saveEntity.getCid()!=null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
	List<Contact> contactList= new ArrayList<Contact>();
				List<ContactDetailsEntity> entriesList =	Contactdao.findAll();
				entriesList.forEach(entity -> {
					Contact c=new Contact();
				BeanUtils.copyProperties(entity, c);
				contactList.add(c);
					
				});
				
		
		return  contactList;
	}

	@Override
	public Contact getContactById(Integer cid) {
		// TODO Auto-generated method stub
	Optional<ContactDetailsEntity> opt= 	Contactdao.findById(cid);
	if(opt.isPresent()) {
		ContactDetailsEntity entity=opt.get();	
	Contact c=new Contact();
	BeanUtils.copyProperties(entity, c);
	return c;
	}
		return null;
	}

	@Override
	public boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
	
		
		return false;
	}

	

	@Override
	public void deleteContactById(Integer cid) {
		// TODO Auto-generated method stub
	 Contactdao.deleteById(cid);
		
		
	
	}

}
