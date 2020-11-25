package com.evolent.evolentapi.dao;

import java.util.List;

import com.evolent.evolentapi.model.Contact;

public interface ContactDAO {

	
	List<Contact> get();
	
	void save(Contact contact);
	
	void delete(int id);
	
}
