package org.egreen.seed.openfreelancer.server.controller;


/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
import org.egreen.seed.openfreelancer.server.entity.Milestone;
import org.egreen.seed.openfreelancer.server.service.MilestoneDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by dewmal on 7/17/14.
 */
@Controller
@RequestMapping("OpenFreelancer/milestone")
public class MilestoneController {

    @Autowired
    private MilestoneDAOService milestoneDAOService;

    /**
     *
     * save Customer
     *
     * @param milestone
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage save(@RequestBody Milestone milestone) {
        Long res = milestoneDAOService.save(milestone);
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
    public ResponseMessage edit(@RequestBody Milestone milestone) {
        Long res = milestoneDAOService.edit(milestone);
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

    @RequestMapping(value = "getMilestoneById", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Milestone getMilestoneById(@RequestParam("milestoneId")Long milestoneId) {
        return milestoneDAOService.getMilestoneById(milestoneId);
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public List<Milestone> getAll() {
        return milestoneDAOService.getAll();
    }

    @RequestMapping(value = "deleteMilestoneById", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public int deleteMilestoneById(@RequestParam("milestoneId")Long milestoneId) {
        return milestoneDAOService.deleteMilestoneById(milestoneId);
    }

    @RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Milestone getob() {
        return new Milestone();
    }


}