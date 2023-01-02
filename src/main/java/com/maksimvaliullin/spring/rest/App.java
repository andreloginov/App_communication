package com.maksimvaliullin.spring.rest;

import com.maksimvaliullin.spring.rest.configuration.MyConfig;
import com.maksimvaliullin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        /*List<Employee> allEmployees = communication.showAllEmployees();
        System.out.println(allEmployees);

        Employee employee = new Employee("Sveta", "Sokolova", "IT", 900);
        employee.setId(21);
        communication.saveAnEmployee(employee);*/

        communication.deleteAnEmployee(21);
    }
}
