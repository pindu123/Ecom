package  com.example.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Ecommerce.model.Contact;

 

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}