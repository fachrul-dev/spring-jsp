package com.example.springjsp.service;

import com.example.springjsp.entity.Customer;

import java.util.List;

/**
 * @author Fachrul Hidayat
 * @date 28/07/2023
 */
public interface CustomerService {

    List<Customer> getAll();
}
