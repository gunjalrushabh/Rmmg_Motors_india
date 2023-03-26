package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Role;
import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//findby + fieldName
	Optional<User>findUserByName(String username);
	
	
	@Modifying
	@Query("update User set role= :role where username= :username")
	void updateUserRole(@Param("username") String username,@Param("role") Role role);
}
