package com.tts.techtalentstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.techtalentstore.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername (String username);
}
