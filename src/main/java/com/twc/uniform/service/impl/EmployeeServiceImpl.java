package com.twc.uniform.service.impl;

import java.util.List;

import com.twc.uniform.entity.ww_mas_employee;
import com.twc.uniform.repository.MasEmployeeRepository;
import com.twc.uniform.service.EmployeeService;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService  {

    private final MasEmployeeRepository masEmployeeRepository;


    public EmployeeServiceImpl(MasEmployeeRepository masEmployeeRepository) {
        this.masEmployeeRepository = masEmployeeRepository;
    }


    @Override
    public List<ww_mas_employee> findAllByCompany(String employee_id) {
     // masEmployeeRepository.findAll(); 
        return masEmployeeRepository.findAll();
    }
    
}
