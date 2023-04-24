package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

	List<UserEntity> findAll();

	@Query(nativeQuery = true,value = "select * from users where userId > 10")
	List<UserEntity> findUsers();
	
}
