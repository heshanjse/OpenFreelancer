package org.egreen.seed.openfreelancer.server.controller;


/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
import org.egreen.seed.openfreelancer.server.entity.Proposal;
import org.egreen.seed.openfreelancer.server.service.ProposalDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by dewmal on 7/17/14.
 */
@Controller
@RequestMapping("OpenFreelancer/proposal")
public class ProposalController {

    @Autowired
    private ProposalDAOService proposalDAOService;

    /**
     *
     * save Customer
     *
     * @param proposal
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage save(@RequestBody Proposal proposal) {
        Long res = proposalDAOService.save(proposal);
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
    public ResponseMessage edit(@RequestBody Proposal proposal) {
        Long res = proposalDAOService.edit(proposal);
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

    @RequestMapping(value = "getProposalById", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Proposal getProposalById(@RequestParam("proposalId")Long proposalId) {
        return proposalDAOService.getProposalById(proposalId);
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public List<Proposal> getAll() {
        return proposalDAOService.getAll();
    }

    @RequestMapping(value = "deleteProposalById", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public int deleteProposalById(@RequestParam("proposalId")Long proposalId) {
        return proposalDAOService.deleteProposalById(proposalId);
    }

    @RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Proposal getob() {
        return new Proposal();
    }


}