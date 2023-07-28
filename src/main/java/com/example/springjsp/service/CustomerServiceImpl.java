package com.example.springjsp.service;

import com.example.springjsp.repository.CustomerRepository;
import com.example.springjsp.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fachrul Hidayat
 * @date 28/07/2023
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = repository.findAll();
        return customers;
    }
}
