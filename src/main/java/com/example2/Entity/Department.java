package com.example2.Entity;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")
public class Department 
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length = 10)
	  private int dept_id;
	
	@Column(length = 100)
	  private String dept_name;

	
	
	//one department have many employees
	  @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	  @JsonIgnoreProperties("department")
	  List<Employee> employees;


	
	
	
	}
		
		
	
	




