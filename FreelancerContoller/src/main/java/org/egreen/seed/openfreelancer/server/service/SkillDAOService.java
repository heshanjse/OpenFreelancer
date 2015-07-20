package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.SkillDAOController;
import org.egreen.seed.openfreelancer.server.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
@Service
public class SkillDAOService {

    @Autowired
    private SkillDAOController skillDAOController;
    private List<Skill> all;


    /**
     *
     * Customer SignUp
     *
     * @param skill
     * @return
     */
    public Long save(Skill skill) {
        long skill_id = new Date().getTime();
        skill.setIdSkill(skill_id);


        Long aLong = skillDAOController.create(skill);
        return aLong;
    }


    public List<Skill> getAll() {

        return skillDAOController.getAll();
    }

    public Long edit(Skill freelancer) {

        return (Long)skillDAOController.update(freelancer);
    }

    public Skill getFreelancerById(Long freelancerId) {

        return skillDAOController.read(freelancerId);
    }

    public int deleteFreelancerById(Long freelancerId) {

        return 0;
    }


}
