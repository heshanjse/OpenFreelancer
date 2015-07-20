package org.egreen.seed.openfreelancer.server.controller;

import org.egreen.seed.openfreelancer.server.entity.Freelancer;
import org.egreen.seed.openfreelancer.server.models.FreeLancerSkils;
import org.egreen.seed.openfreelancer.server.service.FreelancerDAOService;
import org.egreen.seed.openfreelancer.server.service.FreelancerhasSkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
@Controller
@RequestMapping("OpenFreelancer/freelancer")
public class FreelancerController {

    @Autowired
    private FreelancerDAOService freelancerDAOService;
    @Autowired
    private FreelancerhasSkillsService freelancerhasSkillsService;

    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage save(@RequestBody FreeLancerSkils freeLancerSkils) {

      //  System.out.println(freeLancerSkils.getFreelancer().getIdFreelancer());
     //   System.out.println(freeLancerSkils.getIntegerList());
        Long res = freelancerDAOService.save(freeLancerSkils.getFreelancer());
        Long skillres = freelancerhasSkillsService.save(freeLancerSkils.getIntegerList(),res);
        ResponseMessage responseMessage;
        if(res != 0){
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
    public ResponseMessage edit(@RequestBody Freelancer freelancer) {
        Long res = freelancerDAOService.edit(freelancer);
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

    @RequestMapping(value = "viewmore", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Freelancer getFreelancerById(@RequestParam("freelancerId")Long freelancerId) {
        return freelancerDAOService.getFreelancerById(freelancerId);
    }

    @RequestMapping(value = "login", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Boolean loginfreelancer(@RequestParam("username")String username,@RequestParam("password")String password) {

        return  freelancerDAOService.checklogin(username,password);
      //  return freelancerDAOService.getFreelancerById(freelancerId);
    }

    @RequestMapping(value = "viewall", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public List<Freelancer> getAll() {
        return freelancerDAOService.getAll();
    }

    @RequestMapping(value = "deleteFreelancerById", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public int deleteFreelancerById(@RequestParam("freelancerId")Long freelancerId) {
        return freelancerDAOService.deleteFreelancerById(freelancerId);
    }



    @RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public FreeLancerSkils getob() {
        System.out.println("okkkkkkkkkk");
        return new FreeLancerSkils();
    }


}
