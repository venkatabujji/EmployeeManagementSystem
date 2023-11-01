package com.example2.ServiceImple;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example2.Entity.Department;
import com.example2.Entity.Employee;
import com.example2.Exception.ResourceNotFoundException;
import com.example2.Repository.DepartmentRepository;
import com.example2.Service.DepartmentService;
import com.example2.Util.Converter;

@Service
public class DepartmentServiceImple implements DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private Converter converter;
	
	
	
	
	@Override
	public List<Department> getAllDepartments()
	{
		List<Department> departmentList=departmentRepository.findAll();
		ArrayList<Department> departments=new  ArrayList<>(departmentList);
		return departments;
	}
	
	@Override
	public Department getDepartmentById(int dept_id)
	{
		try
		{
			Department department=departmentRepository.findById(dept_id).get();
		return department;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	public Department addDepartment(Department department)
	{
		departmentRepository.save(department);
		return department;
	}
	
	@Override
	public Department updateDepartment(int dept_id, Department department)
	{
		try
		{
			Department newDepartment=departmentRepository.findById(dept_id).get();
		if(department.getDept_name()!=null)
		{
			newDepartment.setDept_name(department.getDept_name());
		}
		departmentRepository.save(newDepartment);
		return newDepartment;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		}
	
	@Override
	public String deleteDepartment(int dept_id) 
	{
		try
		{
			departmentRepository.deleteById(dept_id);
		    return "Employees got deleted successfully!!";
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
}
