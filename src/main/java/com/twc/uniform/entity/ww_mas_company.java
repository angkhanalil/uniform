package com.twc.uniform.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ww_mas_company {
 
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "company_id")
    int id;

    @Column(name = "company_code")
    String company_code;

    @Column(name = "company_name")
    String company_name;

    @Column(name = "company_addr")
    String company_addr;

    @Column(name = "company_tel")
    String company_tel;

    @Column(name = "company_desc")
    String company_desc;

    @Column(name = "img_company")
    String img_company;

    @Column(name = "company_status")
    String company_status;

    @Column(name = "flag_del")
    String flag_del;

    @OneToMany
    Collection<ww_mas_clothing_cat> clothingcats = new ArrayList<>();

    @OneToMany
    List<ww_mas_project> projects = new ArrayList<>();

    
    public List<ww_mas_project> getProjects() {
        return projects;
    }

    public void setProjects(List<ww_mas_project> projects) {
        this.projects = projects;
    }

    public Collection<ww_mas_clothing_cat> getClothingcats() {
        return clothingcats;
    }

    public void setClothingcats(Collection<ww_mas_clothing_cat> clothingcats) {
        this.clothingcats = clothingcats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_code() {
        return company_code;
    }

    public void setCompany_code(String company_code) {
        this.company_code = company_code;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_addr() {
        return company_addr;
    }

    public void setCompany_addr(String company_addr) {
        this.company_addr = company_addr;
    }

    public String getCompany_tel() {
        return company_tel;
    }

    public void setCompany_tel(String company_tel) {
        this.company_tel = company_tel;
    }

    public String getCompany_desc() {
        return company_desc;
    }

    public void setCompany_desc(String company_desc) {
        this.company_desc = company_desc;
    }

    public String getImg_company() {
        return img_company;
    }

    public void setImg_company(String img_company) {
        this.img_company = img_company;
    }

    public String getCompany_status() {
        return company_status;
    }

    public void setCompany_status(String company_status) {
        this.company_status = company_status;
    }

    public String getFlag_del() {
        return flag_del;
    }

    public void setFlag_del(String flag_del) {
        this.flag_del = flag_del;
    }

}
