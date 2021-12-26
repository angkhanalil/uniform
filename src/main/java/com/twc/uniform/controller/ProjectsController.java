package com.twc.uniform.controller;

import java.util.List;

import com.twc.uniform.entity.ww_mas_project;
import com.twc.uniform.service.ProjectService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectsController {
    private final ProjectService projectService;

    public ProjectsController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ww_mas_project>> getprojectall() {
        return ResponseEntity.ok().body(projectService.findAllProjects());
    }

    @GetMapping("/project_company")
    public ResponseEntity<List<ww_mas_project>> getproject_company(@RequestBody String companyid) {
        return ResponseEntity.ok().body(projectService.findProjectsByCompany(companyid));
    }

    @GetMapping("/project")
    public ResponseEntity<ww_mas_project> getproject(@RequestBody String projectid) {
        return ResponseEntity.ok().body(projectService.findProject(projectid));
    }
}
