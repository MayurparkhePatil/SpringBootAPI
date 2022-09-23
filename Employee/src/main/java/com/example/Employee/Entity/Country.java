package com.example.Employee.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.Data;
@Entity
@Data
@Table(name="EmpCountry")

public class Country {
     @Id
	private int id;
	private String name;
	private String currency;
	
	
}
