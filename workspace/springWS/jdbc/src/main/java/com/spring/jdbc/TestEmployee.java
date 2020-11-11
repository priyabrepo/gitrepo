package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context/EmployeeDaoContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		Boolean status = dao.saveEmployeeByPreparedStatement(new Employee(108, "Amit", 35000));
		System.out.println(status);
	}

}
