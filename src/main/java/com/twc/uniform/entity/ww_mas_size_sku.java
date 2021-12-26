package com.twc.uniform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ww_mas_size_sku {
    
    @Id
    private int clothing_cat_id;
    private String size_twc;
    private String size_customer;
    private String sku;
    private String barcode;
    private String cat_desc;
    private String sku_desc;
    public int getClothing_cat_id() {
        return clothing_cat_id;
    }
    public void setClothing_cat_id(int clothing_cat_id) {
        this.clothing_cat_id = clothing_cat_id;
    }
    public String getSize_twc() {
        return size_twc;
    }
    public void setSize_twc(String size_twc) {
        this.size_twc = size_twc;
    }
    public String getSize_customer() {
        return size_customer;
    }
    public void setSize_customer(String size_customer) {
        this.size_customer = size_customer;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public String getCat_desc() {
        return cat_desc;
    }
    public void setCat_desc(String cat_desc) {
        this.cat_desc = cat_desc;
    }
    public String getSku_desc() {
        return sku_desc;
    }
    public void setSku_desc(String sku_desc) {
        this.sku_desc = sku_desc;
    }
    
}
