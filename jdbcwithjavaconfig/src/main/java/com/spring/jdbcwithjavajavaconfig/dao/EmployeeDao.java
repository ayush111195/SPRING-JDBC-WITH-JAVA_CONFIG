package com.spring.jdbcwithjavajavaconfig.dao;

import com.spring.jdbcwithjavaconfig.entites.Employee;

public interface EmployeeDao {
public int insert (Employee employee);
public int change (Employee employee);
public int dlt(Employee employee);
}
