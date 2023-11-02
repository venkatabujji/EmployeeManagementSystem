package com.example2.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.example2.DTO.EmployeeDTO;
import com.example2.Entity.Employee;



public interface EmployeeService 
{
	
	List<Employee> getEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(int id,Employee employee);
	String deleteEmployee(int id);
	Employee addEmployee(Employee employee);
	String assignDepartmentToEmployee(int did, int eid);
	
}
