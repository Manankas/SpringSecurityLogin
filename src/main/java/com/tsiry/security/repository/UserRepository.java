/**
 * 
 */
package com.tsiry.security.repository;

/**
 * @author Tsiry MANANKASINA
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsiry.security.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {
	 User findByEmail(String email);
}
