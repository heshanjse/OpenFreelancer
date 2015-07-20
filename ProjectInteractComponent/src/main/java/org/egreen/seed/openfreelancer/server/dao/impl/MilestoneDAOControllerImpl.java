package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.MilestoneDAOController;
import org.egreen.seed.openfreelancer.server.entity.Milestone;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class MilestoneDAOControllerImpl extends AbstractDAOController<Milestone,Long> implements MilestoneDAOController {
    public MilestoneDAOControllerImpl() {
        super(Milestone.class, Long.class);
    }



}
