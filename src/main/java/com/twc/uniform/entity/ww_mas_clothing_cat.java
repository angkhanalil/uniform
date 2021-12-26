package com.twc.uniform.entity;
 
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class ww_mas_clothing_cat {
   
    @Id
    private int clothing_cat_id;
    private int company_id;
    private String clothing_cat_name;
    private String clothing_desc;

    @OneToMany
    List<ww_mas_size_sku> size = new ArrayList<>();

    
    public List<ww_mas_size_sku> getSize() {
        return size;
    }
    public void setSize(List<ww_mas_size_sku> size) {
        this.size = size;
    }
    public int getClothing_cat_id() {
        return clothing_cat_id;
    }
    public void setClothing_cat_id(int clothing_cat_id) {
        this.clothing_cat_id = clothing_cat_id;
    }
    public int getCompany_id() {
        return company_id;
    }
    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
    public String getClothing_cat_name() {
        return clothing_cat_name;
    }
    public void setClothing_cat_name(String clothing_cat_name) {
        this.clothing_cat_name = clothing_cat_name;
    }
    public String getClothing_desc() {
        return clothing_desc;
    }
    public void setClothing_desc(String clothing_desc) {
        this.clothing_desc = clothing_desc;
    }
    
     
}
