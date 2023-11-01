package com.example2.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example2.Entity.Department;



public class EmployeeDTO 
{
	
	@NotNull
	@Size(min=3,max=12,message = "id should have min 2 to max 12 characters")
	private String  emp_id;
	
	@NotNull
	@Size(min=3,max=50,message = "Name should have min 2 to max 50 characters")
	private String emp_name;
	
	@NotNull
	@Size(min=5,max=50,message = "Name should have min 2 to max 50 characters")
	private String emp_email;
	
	@NotNull
	@Size(min=5,max=15,message = "Name should have min 2 to max 15 characters")
	private String gender;
	
	@NotNull
	@Size(min=5,max=15,message = "Name should have min 2 to max 15 characters")
	private String salary;
	
	@NotNull
	private String emp_phn_no;
	private Department department;
}


