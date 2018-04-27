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

import com.tsiry.security.model.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String role);

}