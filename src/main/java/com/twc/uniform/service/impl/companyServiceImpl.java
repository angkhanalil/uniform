package com.twc.uniform.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List; 

import javax.sql.DataSource;

import com.twc.uniform.entity.ww_mas_clothing_cat;
import com.twc.uniform.entity.ww_mas_company;
import com.twc.uniform.repository.MasCompanyRepository;
import com.twc.uniform.service.ClothingCatService;
import com.twc.uniform.service.companyService;

import org.springframework.stereotype.Service;

@Service
public class companyServiceImpl implements companyService   {
    
    private final MasCompanyRepository companyRepo;
    private final  DataSource dataSource; 
    private final ClothingCatService clothingCatService;
     
    public companyServiceImpl(MasCompanyRepository companyRepo,DataSource dataSource ,ClothingCatService clothingCatService ) {
        this.companyRepo = companyRepo;
        this.dataSource = dataSource; 
        this.clothingCatService = clothingCatService;
    }


    @Override
    public List<ww_mas_company> getCompany() {        
        return  companyRepo.findAll();
    }


    @Override
    public List<ww_mas_company> findAllCompany() {
        String query = "select * from  WW_MAS_COMPANY WHERE  FLAG_DEL = '0' ";
        Connection cn;
        List<ww_mas_company> company = new ArrayList<>();
        ww_mas_company comp = new ww_mas_company();
        
        try{
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while(res.next()){
                comp = new ww_mas_company();
                comp.setId(res.getInt("COMPANY_ID"));
                comp.setCompany_code(res.getString("COMPANY_CODE"));
                comp.setCompany_name(res.getString("COMPANY_NAME"));
            
                company.add(comp);
            }
            res.close();
            stmt.close();
            cn.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        return company;
    }


    @Override
    public ww_mas_company findCompany(String companyid) {
        String query = "select * from  WW_MAS_COMPANY WHERE  FLAG_DEL = '0' AND COMPANY_ID = '"+companyid+"' ";
        Connection cn; 
        ww_mas_company company = new ww_mas_company();
        try{
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while(res.next()){
                company = new ww_mas_company();
                company.setId(res.getInt("COMPANY_ID"));
                company.setCompany_code(res.getString("COMPANY_CODE"));
                company.setCompany_name(res.getString("COMPANY_NAME")); 

                Collection<ww_mas_clothing_cat> clothingcats = new ArrayList<>();
                clothingcats =  clothingCatService.getClothingAll();
                company.setClothingcats(clothingcats);
            }
            res.close();
            stmt.close();
            cn.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        return company;
         
    }

 
    
}
