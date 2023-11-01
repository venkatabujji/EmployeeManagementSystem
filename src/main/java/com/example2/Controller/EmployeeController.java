package com.example2.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example2.Entity.Employee;
import com.example2.Service.EmployeeService;





@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/Employees")
	public List<Employee> getEmployees()
	{
		return employeeservice.getEmployees();
	}
	
	@GetMapping("/Employee/{emp_id}")
	public Employee getEmployeeById(@PathVariable("emp_id") int emp_id)
	{
		return employeeservice.getEmployeeById(emp_id);

	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeservice.addEmployee(employee);
	}
	
	
	@PutMapping("/updateEmployee/{emp_id}")
	public Employee updateEmployee(@PathVariable("emp_id") int id,@RequestBody Employee employee)
	{
		return employeeservice.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/deleteEmployee/{emp_id}")

	public String deleteEmployee(@PathVariable("emp_id") int id)
	{
		return employeeservice.deleteEmployee(id);
	}
}


