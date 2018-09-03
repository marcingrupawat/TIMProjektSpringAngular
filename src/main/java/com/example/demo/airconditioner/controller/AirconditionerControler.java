package com.example.demo.airconditioner.controller;


import com.example.demo.model.Obiekty;
import com.example.demo.repository.AirconditionerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@CrossOrigin(origins = {"*"})
public class AirconditionerControler {


    @Autowired
    AirconditionerRepository airconditionerRepository;



    @GetMapping("/airconditioner1")
    public List<Obiekty> getAllCustomers() {

        List<Obiekty> customers = new ArrayList();
        airconditionerRepository.findAll().forEach(customers::add);

        return customers;
    }

}



