package com.example.springjsp.controller;

import com.example.springjsp.service.CustomerService;
import com.example.springjsp.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Fachrul Hidayat
 * @date 27/07/2023
 */

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private CustomerService service;

    @GetMapping("/home")
    public String Home(Model model) {

        List<Customer> customers = service.getAll();
        log.info("======== Data ============ {}",customers);
        model.addAttribute("customers",customers);
        return  "index";
    }
}
