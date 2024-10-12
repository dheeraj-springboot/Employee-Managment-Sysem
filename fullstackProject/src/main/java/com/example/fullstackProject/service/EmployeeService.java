package com.example.fullstackProject.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fullstackProject.exception.UsernotFoundException;
import com.example.fullstackProject.model.Employee;
import com.example.fullstackProject.repo.Employerepo;
@Service
public class EmployeeService {
	private final Employerepo employeerepo ;
	
	
	@Autowired
	public EmployeeService(Employerepo employeerepo) {
				this.employeerepo = employeerepo;
	}
	
	public Employee addEmploye(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeerepo.save(employee);
		
	}
	public List<Employee> findallEmployees(){
		return employeerepo.findAll();
	}
	
	public Employee updateEmpolyee(Employee employee) {
		return employeerepo.save(employee);
	}
	public Employee findById(Long id) {
        return employeerepo.findById(id)
                .orElseThrow(() -> new UsernotFoundException("Employee not found with ID: " + id));
    }
	
	public void DeleteByid(Long id) {
		employeerepo.deleteById(id);
	}
	

}
