package com.spring.jdbcwithjavajavaconfig.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbcwithjavaconfig.entites.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplates;
	public int insert(Employee employee) {
		// insert the value-->>
		 String query="insert into employee(id,name,city)values(?,?,?)";
		 int r = this.jdbcTemplates.update(query,employee.getId(),employee.getName(),employee.getCity());
		 
		return r;
	}
	public int change(Employee employee) {
		// updating the value--->>>
		String query= "update Employee set name=?, city=? where id=?";
		int r1=this.jdbcTemplates.update(query,employee.getName(),employee.getCity(),employee.getId());
		return r1;
	}
	public int dlt(Employee employee) {
		// dlt the value---->>>
		String query="delete from Employee where id=?";
		int r2=this.jdbcTemplates.update(query,employee.getId());
		return r2;
	}
	
	public JdbcTemplate getJdbcTemplates() {
		return jdbcTemplates;
	}
	public void setJdbcTemplates(JdbcTemplate jdbcTemplates) {
		this.jdbcTemplates = jdbcTemplates;
	}
	
	

}
