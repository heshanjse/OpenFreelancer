package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.ProposalDAOController;
import org.egreen.seed.openfreelancer.server.entity.Proposal;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class ProposalDAOControllerImpl extends AbstractDAOController<Proposal,Long> implements ProposalDAOController {
    public ProposalDAOControllerImpl() {
        super(Proposal.class, Long.class);
    }



}
