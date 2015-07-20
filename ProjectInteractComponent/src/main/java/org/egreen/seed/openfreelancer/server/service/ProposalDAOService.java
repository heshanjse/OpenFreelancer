package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.ProposalDAOController;
import org.egreen.seed.openfreelancer.server.entity.Proposal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ProposalDAOService {

@Autowired
private ProposalDAOController proposalDAOController;




public Long save(Proposal proposal) {
long Proposal_id = new Date().getTime();
 proposal.setIdproposal(Proposal_id);


Long aLong = proposalDAOController.create(proposal);
return aLong;
}


public List<Proposal> getAll() {
return proposalDAOController.getAll();
}

public Long edit(Proposal proposal) {

return  proposalDAOController.update(proposal);
}

public int deleteProposalById(Long ProposalId) {
return 0;
}

public Proposal getProposalById(Long ProposalId) {
return  proposalDAOController.read(ProposalId);
}
}