package com.twc.uniform.controller;

import java.util.List;

import com.twc.uniform.entity.ww_mas_company;
import com.twc.uniform.service.companyService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final companyService companyService;

    public CompanyController(com.twc.uniform.service.companyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ww_mas_company>> getCompany() {
        return ResponseEntity.ok().body(companyService.findAllCompany());
    }

    @GetMapping("/findCompany")
    public ResponseEntity<ww_mas_company> findCompany(@RequestBody String companyid) {

        return ResponseEntity.ok().body(companyService.findCompany(companyid));
    }

    @PostMapping("/save")
    public ResponseEntity<ww_mas_company> save(@RequestBody ww_mas_company company) {
        return null;// ResponseEntity.ok().body(companyService.findCompany(companyid));
    }

    @PostMapping("/update")
    public ResponseEntity<ww_mas_company> update(@RequestBody ww_mas_company company) {
        return null;// ResponseEntity.ok().body(companyService.findCompany(companyid));
    }

}
