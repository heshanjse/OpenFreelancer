package org.egreen.seed.openfreelancer.server.controller;


/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
import org.egreen.seed.openfreelancer.server.entity.Accept;
import org.egreen.seed.openfreelancer.server.service.AcceptDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by dewmal on 7/17/14.
 */
@Controller
@RequestMapping("OpenFreelancer/accept")
public class AcceptController {

    @Autowired
    private AcceptDAOService acceptDAOService;

    /**
     *
     * save Customer
     *
     * @param accept
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage save(@RequestBody Accept accept) {
        Long res = acceptDAOService.save(accept);
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
    public ResponseMessage edit(@RequestBody Accept accept) {
        Long res = acceptDAOService.edit(accept);
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

    @RequestMapping(value = "getAcceptById", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Accept getAcceptById(@RequestParam("acceptId")Long acceptId) {
        return acceptDAOService.getAcceptById(acceptId);
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public List<Accept> getAll() {
        return acceptDAOService.getAll();
    }

    @RequestMapping(value = "deleteAcceptById", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public int deleteAcceptById(@RequestParam("acceptId")Long acceptId) {
        return acceptDAOService.deleteAcceptById(acceptId);
    }

    @RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Accept getob() {
        return new Accept();
    }


}