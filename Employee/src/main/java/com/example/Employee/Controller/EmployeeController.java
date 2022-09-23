package com.example.Employee.Controller;
	
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.Service.EmployeeSevice;



	@RestController

	public class EmployeeController {
		@Autowired
		private EmployeeSevice employeeSevice ;
		
		
		
		@GetMapping("/employees")
		public List<EmployeeEntity> getEmployee() {
			return this.employeeSevice.getEmployee();
		}
		
		
		
		@PostMapping("/Employee")
		public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity) {
			return this.employeeSevice.addemployee(employeeEntity);
		}
		
		
		@PutMapping("/update")
		public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity ) {
			return this.employeeSevice.updateEmployee(employeeEntity);
			
		}
		@GetMapping("/employee/{id}")
		public EmployeeEntity getEmployee(@PathVariable String id) {
			return this.employeeSevice.getEmployee(Integer.parseInt(id));
		}
		@DeleteMapping("/employee/{id}")
		public ResponseEntity<HttpStatus> Deleteemployee( @PathVariable String id){
			try {
				   this.employeeSevice.Deleteemployee(Integer.parseInt(id));
					   return new ResponseEntity<>(HttpStatus.OK);
				   
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			
		}
		
}
