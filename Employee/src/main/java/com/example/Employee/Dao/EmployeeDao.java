package com.example.Employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.Entity.EmployeeEntity;



public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {

}
