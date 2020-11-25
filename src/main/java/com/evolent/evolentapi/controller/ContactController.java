package com.evolent.evolentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evolent.evolentapi.model.Contact;
import com.evolent.evolentapi.service.ContactService;

@RestController
@RequestMapping("/api")
public class ContactController {
	
	@Autowired
	private ContactService contactService;

	@GetMapping("/contact")
	public List<Contact> get(){
		return contactService.get();
	}
	
	@PostMapping("/contact")
	public Contact save(@RequestBody Contact contact){
		 contactService.save(contact);
		 return contact;
	}
	
	@PutMapping("/contact")
	public Contact update(@RequestBody Contact contact){
		 
			contactService.save(contact);
		
		 return contact;
	}
	
	@DeleteMapping("/contact/{id}")
	public String delete(@PathVariable int id) {
		
		try {
			contactService.delete(id);
		} catch (Exception e) {
			return "Contact not found, please try with correct phone number";
		}
		return "Contact has been deleted successfully";
	}
}
