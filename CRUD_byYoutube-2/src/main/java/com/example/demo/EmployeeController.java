package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v3")
@RestController
public class EmployeeController {
	@Autowired 
	 EmployeeRepository repo;

  @GetMapping("/employees")
              //class name
  public List<Employee> getAllEmployees(){
	  return repo.findAll();
  }
  
  @GetMapping("/employees/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
	  Employee employee=repo.findById(employeeId).orElseThrow();
	  return ResponseEntity.ok().body(employee);
  }
  
  @PostMapping("/add")
  public Employee addEmployee(@RequestBody Employee emp) {
	  return repo.save(emp);
  }
  @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId){
	  Employee employee=repo.findById(employeeId).orElseThrow();
	  repo.delete(employee);
	  Map<String, Boolean> response=new HashMap<>();
	  response.put("deleted", Boolean.TRUE);
	  return response;
  }
  @PutMapping("/update/{id}")
     public ResponseEntity<Employee> updateEmployee(@PathVariable (value= "id") Long employeeId,
    		 @Valid @RequestBody Employee employeeDetails){
	    Employee employee=repo.findById(employeeId).orElseThrow();
	     employee.setFirstName(employeeDetails.getFirstName());
	     employee.setLastName(employeeDetails.getLastName());
	     employee.setEmailId(employeeDetails.getEmailId());
	     final Employee updatedEmployee=repo.save(employee);
	     return ResponseEntity.ok(updatedEmployee);
  }
}
