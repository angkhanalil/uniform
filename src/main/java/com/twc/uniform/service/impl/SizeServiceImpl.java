package com.twc.uniform.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.twc.uniform.entity.ww_mas_size_sku;
import com.twc.uniform.service.SizeService;

import org.springframework.stereotype.Service;

@Service
public class SizeServiceImpl implements SizeService {

    private final  DataSource dataSource;

    public SizeServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<ww_mas_size_sku> findAll() { 
       String query = "select * from  WW_MAS_SIZE_SKU WHERE  FLAG_DEL = '0' ";
        Connection cn;
        List<ww_mas_size_sku> sizes = new ArrayList<>();
        ww_mas_size_sku size = new ww_mas_size_sku();
        
        try{
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while(res.next()){
                size = new ww_mas_size_sku();
                size.setClothing_cat_id(res.getInt("CLOTHING_CAT_ID"));
                size.setSize_twc(res.getString("SIZE_TWC"));
                size.setSize_customer(res.getString("SIZE_CUSTOMER"));
                size.setSku(res.getString("SKU"));
            
                sizes.add(size);
            }
            res.close();
            stmt.close();
            cn.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        return sizes;
    }

    @Override
    public List<ww_mas_size_sku> findSizeByClothing(String clothingid) { 
        String query = "select * from  WW_MAS_SIZE_SKU WHERE  FLAG_DEL = '0' AND CLOTHING_CAT_ID ='"+clothingid+"' ";
        Connection cn;
        List<ww_mas_size_sku> sizes = new ArrayList<>();
        ww_mas_size_sku size = new ww_mas_size_sku();
        
        try{
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while(res.next()){
                size = new ww_mas_size_sku();
                size.setClothing_cat_id(res.getInt("CLOTHING_CAT_ID"));
                size.setSize_twc(res.getString("SIZE_TWC"));
                size.setSize_customer(res.getString("SIZE_CUSTOMER"));
                size.setSku(res.getString("SKU"));
            
                sizes.add(size);
            }
            res.close();
            stmt.close();
            cn.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        return sizes;
    } 
 
}
