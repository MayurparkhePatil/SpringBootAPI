package com.example.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Dao.EmployeeDao;
import com.example.Employee.Entity.EmployeeEntity;


@Service
public class EmployeeServiceIMPL implements EmployeeSevice {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<EmployeeEntity> getEmployee() {
		return employeeDao.findAll() ;
	
	}
	@Override
	public EmployeeEntity addemployee(EmployeeEntity employeeEntity) {
		employeeDao.save(employeeEntity);
		return employeeEntity;
	}
	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		employeeDao.save(employeeEntity);
		return employeeEntity;
	}

	@Override
	public EmployeeEntity getEmployee(int id) {
		return employeeDao.getOne(id);
	}
	@Override
	public void Deleteemployee(int parseInt) {
		EmployeeEntity entity=employeeDao.getOne(parseInt);
		employeeDao.delete(entity);
		
	}

	
}
	
	
