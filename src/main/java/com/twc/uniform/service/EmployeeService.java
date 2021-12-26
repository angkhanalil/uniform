package com.twc.uniform.service;

import java.util.List;

import com.twc.uniform.entity.ww_mas_employee;
 


public interface EmployeeService {
    
    List<ww_mas_employee> findAllByCompany(String companyid);

}
