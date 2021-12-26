package com.twc.uniform.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; 

import javax.sql.DataSource;

import com.twc.uniform.entity.ww_mas_clothing_cat;
import com.twc.uniform.service.ClothingCatService;

import org.springframework.stereotype.Service;

@Service
public class ClothingCatServiceImpl implements ClothingCatService {

    private final  DataSource dataSource;

    
    public ClothingCatServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public List<ww_mas_clothing_cat> getClothingAll() {
        String query = "select * from  WW_MAS_CLOTHING_CAT WHERE  FLAG_DEL = '0' ";
        Connection cn;
        List<ww_mas_clothing_cat> clothingcats = new ArrayList<>();
        ww_mas_clothing_cat clothingcat = new ww_mas_clothing_cat();
        
        try{
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while(res.next()){
                clothingcat = new ww_mas_clothing_cat();
                clothingcat.setClothing_cat_id(res.getInt("CLOTHING_CAT_ID"));
                
            
                clothingcats.add(clothingcat);
            }
            res.close();
            stmt.close();
            cn.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        return clothingcats;
    }


    @Override
    public List<ww_mas_clothing_cat> findClothingByCompany(String companyid) {
        String query = "select * from  WW_MAS_CLOTHING_CAT WHERE  FLAG_DEL = '0' AND COMPANY_ID = '"+companyid+"' ";
        Connection cn;
        List<ww_mas_clothing_cat> clothingcats = new ArrayList<>();
        ww_mas_clothing_cat clothingcat = new ww_mas_clothing_cat();
        
        try{
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while(res.next()){
                clothingcat = new ww_mas_clothing_cat();
                clothingcat.setClothing_cat_id(res.getInt("CLOTHING_CAT_ID"));
                clothingcat.setClothing_cat_name(res.getString("CLOTHING_CAT_NAME"));
                
            
                clothingcats.add(clothingcat);
            }
            res.close();
            stmt.close();
            cn.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        return clothingcats;
    }
    
}
