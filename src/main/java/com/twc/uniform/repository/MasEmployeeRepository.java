package com.twc.uniform.repository;

import java.util.List;

import com.twc.uniform.entity.ww_mas_employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MasEmployeeRepository extends JpaRepository<ww_mas_employee,Long> {

    public List<ww_mas_employee> findAll();
      
    
}
