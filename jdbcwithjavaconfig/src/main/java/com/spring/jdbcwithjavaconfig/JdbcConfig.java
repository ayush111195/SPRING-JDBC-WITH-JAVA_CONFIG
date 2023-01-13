package com.spring.jdbcwithjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbcwithjavaconfig.entites.Employee;
import com.spring.jdbcwithjavajavaconfig.dao.EmployeeDao;
import com.spring.jdbcwithjavajavaconfig.dao.EmployeeDaoImpl;

@Configuration

public class JdbcConfig {

	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://Localhost:3306/springjdbcwithjava");
		ds.setUsername("root");
		ds.setPassword("Ayush123@");
		return ds;
		
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	@Bean("employeedao")
	public EmployeeDao getEmployee() {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		employeeDao.setJdbcTemplates(getTemplate());
		return employeeDao;
		
		
	}
}
