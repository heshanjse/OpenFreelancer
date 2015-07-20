package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.SkillDAOController;
import org.egreen.seed.openfreelancer.server.entity.Skill;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class SkillDAOControllerImpl extends AbstractDAOController<Skill,Long> implements SkillDAOController {
    public SkillDAOControllerImpl() {
        super(Skill.class, Long.class);
    }



}
