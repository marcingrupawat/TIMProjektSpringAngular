package com.example.demo.airconditioner.controller;

import com.example.demo.airconditioner.service.AirconditionerService;
import com.example.demo.model.StatusobiektowEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class AirconditionerControler {


    @Autowired
    AirconditionerService airconditionerService;


   @GetMapping("/airconditioner1")
    public List<StatusobiektowEntity> getAllCustomers() {

        List<StatusobiektowEntity> customers = new ArrayList();
        airconditionerService.fromClause().forEach(customers::add);

        return customers;
    }
/*
    @GetMapping("/home")
    public List<StatusObiektow> getAllCustomers1() {

       List<StatusObiektow> customers1;
       customers1= airconditionerService.tabObj();

        return customers1;
    }*/


}



