package com.example.fullstackProject;

import java.lang.System.Logger;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fullstackProject.model.Employee;
import com.example.fullstackProject.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	private final EmployeeService employeeservice;

	public EmployeeResource(EmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees= employeeservice.findallEmployees();
		//Logger.info("Getting all employees");
		return new ResponseEntity<>(employees,HttpStatus.OK);	
	}
	@GetMapping("/find/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id") Long id) {
        Employee emps = employeeservice.findById(id);
        return new ResponseEntity<>(emps, HttpStatus.OK);
        }
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emps) {
		Employee employ=employeeservice.addEmploye(emps);
		return new ResponseEntity<>(emps, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> UpdateEmployee(@RequestBody Employee emps){
		Employee employ=employeeservice.updateEmpolyee(emps);
		return new ResponseEntity<>(emps, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id){
		employeeservice.DeleteByid(id);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
	
	
	
	
	
	

}
