package com.twc.uniform.controller;

import java.util.List;

import com.twc.uniform.entity.ww_mas_employee;
import com.twc.uniform.service.EmployeeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ww_mas_employee>> getCompany() {
        return ResponseEntity.ok().body(employeeService.findAllByCompany("1"));
    }
}
