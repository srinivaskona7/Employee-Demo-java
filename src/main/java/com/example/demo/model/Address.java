package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private String Doorno;
    private String village;
    private String mandal;
    private String District;
}
