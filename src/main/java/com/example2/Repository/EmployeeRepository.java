package com.example2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.Entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
