package com.example2.Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import com.example2.Entity.Department;
import com.example2.Entity.Employee;
import com.example2.Entity.User;


@Component
public class Converter
{
	public  Employee convertToEmployeeEntity(Employee employee)
	{
		Employee employee1=new Employee();
		if(employee1!=null)
		{
			BeanUtils.copyProperties(employee1, employee1);
		}
	  return employee1;
	}

	
	public Employee convertToEmployee(Employee employee)
	{
		Employee employee1=new Employee();
		if(employee1!=null)
		{
			BeanUtils.copyProperties(employee1, employee1);
		}
		return employee1;
	}

	public   Department convertToDepartmentEntity(Department department)
	{
		Department department1=new Department();
		if(department1!=null)
		{
			BeanUtils.copyProperties(department1, department1);
		}
	     return department1;
	}

	
	public Department convertToDepartment(Department department)
	{
		Department department1=new Department();
		if(department1!=null)
		{
			BeanUtils.copyProperties(department1, department1);
		}
		return department1;
	}
	

	public   User convertToUserEntity(User user)
	{
		User user1=new User();
		if(user1!=null)
		{
			BeanUtils.copyProperties(user1, user1);
		}
		return user1;
	}

	
		public User convertToUser(User user)
		{
			User user1=new User();
			if(user1!=null)
			{
				BeanUtils.copyProperties(user1, user1);
			}
			return user1;
                  }
}



