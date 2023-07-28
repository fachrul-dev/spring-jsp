package com.example.springjsp.repository;

import com.example.springjsp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Fachrul Hidayat
 * @date 28/07/2023
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
