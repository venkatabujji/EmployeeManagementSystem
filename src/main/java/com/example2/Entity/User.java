  package com.example2.Entity;


import javax.persistence.*;
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
	   
	   @Column(length=30)
	   private String userName;
	   
	   @Column(length=30)
	   private String password;
	   
	  
	}

