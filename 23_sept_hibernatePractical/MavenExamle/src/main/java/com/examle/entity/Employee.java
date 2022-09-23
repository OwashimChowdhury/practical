package com.examle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="Empdetails")//table name
public class Employee {
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.AUTO)//auto generated
	//columns
	private int eid;
	@Column(length = 25,nullable = false)
	private String ename;
	@Column(length = 25,nullable = false)
	private String email;
	@Column(length = 12,nullable = false,unique = true)
	private long ephone;
	@Column(length = 10,nullable = false)
	private double salary;
	@Column(length = 50)
	private String addr;
	
	
}
