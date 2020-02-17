package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeJpaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Api(value = "EmployeeController", description = "Rest API for Employee Management")
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeJpaRepository repository;


    @PostMapping("/employee/registerEmployee")
    @ApiOperation(value = " createEmployee", notes = "URI to get Employee By Id.", produces = "application/json", consumes = "application/json", response = Employee.class)
    public String createEmployee(@RequestBody Employee employee){
        repository.save(employee);
        return "Employee Created Successfully";
    }

    @GetMapping("/employee/getById/{id}")                                         
    @ApiOperation(value = " getEmp", notes = "URI to get Employee By Id.", produces = "application/json", consumes = "application/json", response = Employee.class)
    public Employee getEmp(@PathVariable("id") String id){
        Optional<Employee> employeeOptional= repository.findById(id);
        if (employeeOptional.isPresent()){
            return employeeOptional.get();
        }
        return null;
    }


}
