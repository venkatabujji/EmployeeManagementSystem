package com.example2.Service;

import java.util.List;
import com.example2.Entity.Department;


public interface DepartmentService 
{

	List<Department> getAllDepartments();
	Department getDepartmentById(int id);
	Department updateDepartment(int id, Department department);
	String deleteDepartment(int id);
	Department addDepartment(Department department);


}
