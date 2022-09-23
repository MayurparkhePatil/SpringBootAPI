package com.example.Employee.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class EmployeeEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 int id ;
 
 String name ;
 
 int salary;
 
 String department;
 @OneToOne(cascade = CascadeType.ALL)
 private Country country;
}