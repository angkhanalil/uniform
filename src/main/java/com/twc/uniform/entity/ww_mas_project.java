package com.twc.uniform.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class ww_mas_project {
    @Id
    @Column(name = "proj_id")
    int proj_id;

    @Column(name = "company_id")
    int company_id;

    @Column(name = "proj_name")
    String proj_name;

    @Column(name = "proj_desc")
    String proj_desc;

    @Column(name = "proj_status")
    String proj_status;

    @Column(name = "proj_type")
    String proj_type;

    @Column(name = "created_on")
    Date created_on;

    @Column(name = "created_by")
    String created_by;

    @Column(name = "lastchanged_on")
    Date lastchanged_on;

    @Column(name = "lastchanged_by")
    String lastchanged_by;

    public int getProj_id() {
        return proj_id;
    }

    public void setProj_id(int proj_id) {
        this.proj_id = proj_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getProj_name() {
        return proj_name;
    }

    public void setProj_name(String proj_name) {
        this.proj_name = proj_name;
    }

    public String getProj_desc() {
        return proj_desc;
    }

    public void setProj_desc(String proj_desc) {
        this.proj_desc = proj_desc;
    }

    public String getProj_status() {
        return proj_status;
    }

    public void setProj_status(String proj_status) {
        this.proj_status = proj_status;
    }

    public String getProj_type() {
        return proj_type;
    }

    public void setProj_type(String proj_type) {
        this.proj_type = proj_type;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getLastchanged_on() {
        return lastchanged_on;
    }

    public void setLastchanged_on(Date lastchanged_on) {
        this.lastchanged_on = lastchanged_on;
    }

    public String getLastchanged_by() {
        return lastchanged_by;
    }

    public void setLastchanged_by(String lastchanged_by) {
        this.lastchanged_by = lastchanged_by;
    } 

}
