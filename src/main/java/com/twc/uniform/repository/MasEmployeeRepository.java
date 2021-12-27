package com.twc.uniform.repository;

import java.util.List;

import com.twc.uniform.entity.ww_mas_employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MasEmployeeRepository extends JpaRepository<ww_mas_employee,Long> {

    @Query(value = "SELECT * FROM WW_MAS_EMPLOYEE WHERE FLAG_DEL_EMP = '0'", nativeQuery = true)
    public List<ww_mas_employee> findAll();
      
    
}
