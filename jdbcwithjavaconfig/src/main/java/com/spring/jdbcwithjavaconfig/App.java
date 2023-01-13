package com.spring.jdbcwithjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbcwithjavaconfig.entites.Employee;
import com.spring.jdbcwithjavajavaconfig.dao.EmployeeDao;


public class App 
{
    

	public static void main( String[] args )
    {
        System.out.println( "program started......" );
//      
//        //insert query
//        String query="insert into employee(id,name,city)values(?,?,?)";
//        //fire the query
//        int result = temp.update(query,2222,"arpit","ahmdabbad");
//        System.out.println("number of record insert"+result);
        
        //insert the value--->>
        
        ApplicationContext con=new AnnotationConfigApplicationContext(JdbcConfig.class);
        EmployeeDao em  = (EmployeeDao) con.getBean("employeedao");
//        Employee e=new Employee();
//        e.setId(1234);
//        e.setName("sumit yadav");
//        e.setCity("kanpur");
//        int result=em.insert(e);
//        System.out.println("employee added"+result);
        
        //update the value--->>>
//        Employee e1=new Employee();
//        e1.setId(1234);
//        e1.setName("Ashu gupta");
//        e1.setCity("kanpur");
//        int result1=em.change(e1);
//        System.out.println("employee update"+result1);
        
        //dlt the value---->>>
        Employee e2=new Employee();
        e2.setId(1234);
        int result2 = em.dlt(e2);
        System.out.println("dlt employee"+result2);
		}
    }

