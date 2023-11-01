package com.example2.DTO;

import java.util.List;

import com.example2.Entity.Employee;

import lombok.Data;


@Data
public class DepartmentDTO 
{
	private String dept_id;
	private String dept_name;
	private boolean status=Boolean.TRUE;
	List<Employee> employees;
}


