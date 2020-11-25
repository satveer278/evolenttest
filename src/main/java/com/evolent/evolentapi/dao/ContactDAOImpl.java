package com.evolent.evolentapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evolent.evolentapi.model.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Contact> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Contact> query = currentSession.createQuery("from Contact", Contact.class);
		List<Contact> list = query.getResultList();
		return list;
	}

	public void save(Contact contact) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(contact);
	}

	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Contact contact = currentSession.get(Contact.class, id);
		if(contact == null) {
			throw new RuntimeException("Contact not found");
		}
		currentSession.delete(contact);
	}

	

}
