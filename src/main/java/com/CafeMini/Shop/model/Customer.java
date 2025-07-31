package com.CafeMini.Shop.model;

import jakarta.persistence.Entity;

@Entity
public class Customer {
    private  Long id;
    private  String name;
    private String email;
    private String phone;


}
