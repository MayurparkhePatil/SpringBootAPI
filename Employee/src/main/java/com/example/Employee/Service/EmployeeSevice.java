package com.example.Employee.Service;

import java.util.List;

import com.example.Employee.Entity.Country;
import com.example.Employee.Entity.EmployeeEntity;




public interface EmployeeSevice {

	public List<EmployeeEntity> getEmployee();
	
	public EmployeeEntity addemployee(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	
	public EmployeeEntity getEmployee(int id);

	public void Deleteemployee(int parseInt);

}
