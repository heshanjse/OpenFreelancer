package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.ProjectDAOController;


import org.egreen.seed.openfreelancer.server.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


 @Service
 public class ProjectDAOService {

 @Autowired
 private ProjectDAOController projectDAOController;




 public Long save(Project project) {
 long Project_id = new Date().getTime();
 project.setIdProject(Project_id);


 Long aLong = projectDAOController.create(project);
 return aLong;
 }


 public List<Project> getAll() {
 return projectDAOController.getAll();
 }

 public Long edit(Project project) {

 return  projectDAOController.update(project);
 }

 public int deleteProjectById(Long projectId) {
 return 0;
 }

 public Project getProjectById(Long projectId) {
 return  projectDAOController.read(projectId);
 }
 }