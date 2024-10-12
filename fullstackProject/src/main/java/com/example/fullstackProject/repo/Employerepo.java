package com.example.fullstackProject.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackProject.model.Employee;

public interface Employerepo extends JpaRepository<Employee, Long>{

	//void delete(Long id);

	
	
	//Optional<T> FindbyId(Long id);

}
