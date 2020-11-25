package com.evolent.evolentapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolent.evolentapi.dao.ContactDAO;
import com.evolent.evolentapi.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDAO contactDAO;
	
	@Transactional
	@Override
	public List<Contact> get() {
		
		return contactDAO.get();
	}

	@Transactional
	public void save(Contact contact) {
		contactDAO.save(contact);
	}

	@Transactional
	public void delete(int id) {
		contactDAO.delete(id);
	}

	

}
