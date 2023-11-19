package  com.example.Ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce.model.Contact;
import com.example.Ecommerce.repository.ContactRepository;

@Service

	public class ContactService {

	@Autowired

	ContactRepository contactrepository;

	public Contact createcontact(Contact c) {

	return contactrepository.save(c);

	}

	public List<Contact> findcontact() {

	return contactrepository.findAll();

	}

	}
