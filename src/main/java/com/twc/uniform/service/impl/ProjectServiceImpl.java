package com.twc.uniform.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.twc.uniform.entity.ww_mas_project;
import com.twc.uniform.service.ProjectService;

import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final DataSource dataSource;

    public ProjectServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<ww_mas_project> findAllProjects() {
        String query = "select * from  WW_MAS_PROJECT WHERE  FLAG_DEL = '0' ";
        Connection cn;
        List<ww_mas_project> projects = new ArrayList<>();
        ww_mas_project project = new ww_mas_project();

        try {
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                project = new ww_mas_project();
                project.setProj_id(res.getInt("PROJ_ID"));
                project.setCompany_id(res.getInt("COMPANY_ID"));
                project.setProj_name(res.getString("PROJ_NAME"));
                project.setProj_desc(res.getString("PROJ_DESC"));

                projects.add(project);
            }
            res.close();
            stmt.close();
            cn.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return projects;
    }

    @Override
    public ww_mas_project findProject(String projectid) {
        String query = "select * from  WW_MAS_PROJECT WHERE  FLAG_DEL = '0' AND PROJ_ID = '" + projectid + "' ";
        Connection cn;
        ww_mas_project project = new ww_mas_project();
        try {
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                project = new ww_mas_project();
                project.setProj_id(res.getInt("PROJ_ID"));
                project.setCompany_id(res.getInt("COMPANY_ID"));
                project.setProj_name(res.getString("PROJ_NAME"));
                project.setProj_desc(res.getString("PROJ_DESC"));
 
            }

            res.close();
            stmt.close();
            cn.close();
        } catch (Exception ex) {

        }

        return project;
    }

    @Override
    public List<ww_mas_project> findProjectsByCompany(String companyid) {
        String query = "select * from  WW_MAS_PROJECT WHERE  FLAG_DEL = '0' AND COMPANY_ID = '" + companyid + "' ";
        Connection cn;
        List<ww_mas_project> projects = new ArrayList<>();
        ww_mas_project project = new ww_mas_project();

        try {
            cn = this.dataSource.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                project = new ww_mas_project();
                project.setProj_id(res.getInt("PROJ_ID"));
                project.setCompany_id(res.getInt("COMPANY_ID"));
                project.setProj_name(res.getString("PROJ_NAME"));
                project.setProj_desc(res.getString("PROJ_DESC"));

                projects.add(project);
            }
            res.close();
            stmt.close();
            cn.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return projects;
    }

}
