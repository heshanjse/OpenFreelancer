package org.egreen.seed.openfreelancer.server.controller;


/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
import org.egreen.seed.openfreelancer.server.entity.Project;
import org.egreen.seed.openfreelancer.server.service.ProjectDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


 @Controller
 @RequestMapping("OpenFreelancer/project")
 public class ProjectController {

 @Autowired
 private ProjectDAOService projectDAOService;



 @RequestMapping(value = "add", method = RequestMethod.POST)
 @ResponseBody
 public ResponseMessage save(@RequestBody Project project) {
 Long res = projectDAOService.save(project);
 ResponseMessage responseMessage;
 if(res != null){
 responseMessage = ResponseMessage.SUCCESS;
 responseMessage.setData(res);
 }else{
 responseMessage = ResponseMessage.DANGER;
 responseMessage.setData(res);
 }
 return responseMessage;
 }

 @RequestMapping(value = "edit", method = RequestMethod.POST)
 @ResponseBody
 public ResponseMessage edit(@RequestBody Project project) {
 Long res = projectDAOService.edit(project);
 ResponseMessage responseMessage;
 if(res != null){
 responseMessage = ResponseMessage.SUCCESS;
 responseMessage.setData(res);
 }else{
 responseMessage = ResponseMessage.DANGER;
 responseMessage.setData(res);
 }
 return responseMessage;
 }

 @RequestMapping(value = "getProjectById", method = RequestMethod.GET, headers = "Accept=application/json")
 @ResponseBody
 public Project getProjectById(@RequestParam("projectId")Long projectId) {
 return projectDAOService.getProjectById(projectId);
 }

 @RequestMapping(value = "viewallProjects", method = RequestMethod.GET, headers = "Accept=application/json")
 @ResponseBody
 public List<Project> getAll() {
 return projectDAOService.getAll();
 }

 @RequestMapping(value = "deleteProjectById", method = RequestMethod.GET, headers = "Accept=application/json")
 @ResponseBody
 public int deleteProjectById(@RequestParam("projectId")Long projectId) {
 return projectDAOService.deleteProjectById(projectId);
 }

 @RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
 @ResponseBody
 public Project getob() {
 return new Project();
 }


 }
