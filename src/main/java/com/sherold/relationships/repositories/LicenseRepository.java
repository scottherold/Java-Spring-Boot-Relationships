package com.sherold.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sherold.relationships.models.License;

@Repository // Set interface as a repo
public interface LicenseRepository extends CrudRepository<License, Long> {
	// Overwrite findAll() return type to License
		List<License> findAll();
}
