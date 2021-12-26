package com.twc.uniform.service;

import java.util.List;

import com.twc.uniform.entity.ww_mas_company;

public interface companyService {

    List<ww_mas_company> getCompany();
  List<ww_mas_company> findAllCompany();
  ww_mas_company findCompany(String companyid);
}
