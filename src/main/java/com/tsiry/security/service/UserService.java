/**
 * 
 */
package com.tsiry.security.service;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Tsiry MANANKASINA
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tsiry.security.model.Role;
import com.tsiry.security.model.User;
import com.tsiry.security.repository.RoleRepository;
import com.tsiry.security.repository.UserRepository;

@Service("userService")
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private RoleRepository roleRepository;
	
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	
	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
		
	}

	
}
