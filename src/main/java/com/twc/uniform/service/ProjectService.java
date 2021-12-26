package com.twc.uniform.service;

import java.util.List;

import com.twc.uniform.entity.ww_mas_project;

public interface ProjectService {

    List<ww_mas_project> findAllProjects();
    List<ww_mas_project> findProjectsByCompany(String companyid);
    ww_mas_project findProject(String projectid);
}
