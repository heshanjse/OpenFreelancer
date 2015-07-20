package org.egreen.seed.openfreelancer.server.controller;


import org.egreen.seed.openfreelancer.server.entity.Skill;
import org.egreen.seed.openfreelancer.server.service.SkillDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
@Controller
@RequestMapping("OpenFreelancer/skill")
public class SkillController {

    @Autowired
    private SkillDAOService skillDAOService;


    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage save(@RequestBody Skill skill) {
        Long res = skillDAOService.save(skill);
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


    @RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Skill getob() {
        return new Skill();
    }


}
