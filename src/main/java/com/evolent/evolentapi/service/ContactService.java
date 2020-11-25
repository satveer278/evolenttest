package com.evolent.evolentapi.service;

import java.util.List;

import com.evolent.evolentapi.model.Contact;

public interface ContactService {

	List<Contact> get();
	
	void save(Contact contact);
	
	void delete(int id);
	
	
}
