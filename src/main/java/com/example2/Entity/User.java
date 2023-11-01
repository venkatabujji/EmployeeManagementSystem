  package com.example2.Entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="Registration")
@Inheritance(strategy=InheritanceType.JOINED)
public class User
{
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int userId;
	   
	   @NotNull
	   @Column(length=30)
	   private String userName;
	   
	   @NotNull
	   @Column(length=30)
	   private String password;
	   
	  
	}

