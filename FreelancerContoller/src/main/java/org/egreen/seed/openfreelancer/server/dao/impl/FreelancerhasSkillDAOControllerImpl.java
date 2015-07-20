package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.FreelancerhasSkillDAOController;
import org.egreen.seed.openfreelancer.server.entity.FreelancerHasSkill;
import org.egreen.seed.openfreelancer.server.entity.FreelancerHasSkillPK;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class FreelancerhasSkillDAOControllerImpl extends AbstractDAOController<FreelancerHasSkill,FreelancerHasSkillPK> implements FreelancerhasSkillDAOController {
    public FreelancerhasSkillDAOControllerImpl() {
        super(FreelancerHasSkill.class, FreelancerHasSkillPK.class);
    }



}
