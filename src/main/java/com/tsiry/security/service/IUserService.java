/**
 * 
 */
package com.tsiry.security.service;

import com.tsiry.security.model.User;

/**
 * @author Tsiry MANANKASINA
 *
 */
public interface IUserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
