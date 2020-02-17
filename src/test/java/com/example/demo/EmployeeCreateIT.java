package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeCreateIT {

    @Autowired
    private EmployeeJpaRepository repository;


    @Test
    public void create(){
        Employee employee = new Employee();

        employee.setId("u76989776");
        employee.setName("synycs");
        employee.setSalary(15000.56);
        employee.setEmpCreatedDate(LocalDate.now());

        repository.save(employee);

    }
}
