package com.cogent;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Feb9Assessment1Application {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeBean.class);
		Employee e=context.getBean("employee",Employee.class);
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSal());
	}

}
