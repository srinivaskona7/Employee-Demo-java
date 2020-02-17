package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    private String id;
    private String name;
    private double salary;
    private LocalDate empCreatedDate;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
        }


    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setEmpCreatedDate(LocalDate empCreatedDate){
        this.empCreatedDate = empCreatedDate;
    }
    public LocalDate getEmpCreatedDate(){
        return this.empCreatedDate;
    }



    }




  //  private Address address;
