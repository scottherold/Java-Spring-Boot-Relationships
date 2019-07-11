package com.sherold.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sherold.relationships.models.Person;

@Repository // Set interface as a repo
public interface PersonRepository extends CrudRepository<Person, Long> {
	// Overwrite findAll() return type to Person
	List<Person> findAll();
}
