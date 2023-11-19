package  com.example.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.UserRepository;

 

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User registerUser(User user) {
		return userRepository.save(user);
	}

	public User loginUser(String email, String password) {
		User user = userRepository.findByEmail(email);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

//	public String pUpdate(String email, String nPassword) {
//	    try {
//	       User d = userRepository.findAll(Sort.by(null))
//
//	        if (d.isPresent()) {
//	            User details = d.get();
//	            details.setPassword(nPassword);
//	            userRepository.save(details);
//	            return "Success"; // Successful update
//	        } else {
//	            return "User not found"; // User not found
//	        }
//	    } catch (Exception e) {
//	        return "Exception occurred: " + e.getMessage(); // Exception occurred
//	    }
//	}
//	
	public String updateP(String email,String password)
	{
		 try {
		       User details = userRepository.findByEmail(email);
		    	if(details!=null)	   
		         {
		           
		            details.setPassword(password);
		            userRepository.save(details);
		            return "Success"; 
		        } else {
		            return "User not found"; // User not found
		        }
		    } catch (Exception e) {
		        return "Exception occurred: " + e.getMessage(); // Exception occurred
		    }
	}

}
