package com.cogent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeBean {
	
	@Bean(name = "employee")
	public Employee getEmployee() {
		Employee employee=new Employee();
		employee.setEmpId(1001);
		employee.setEmpName("Huy");
		employee.setEmpSal(100);
		return employee;
	}
}
