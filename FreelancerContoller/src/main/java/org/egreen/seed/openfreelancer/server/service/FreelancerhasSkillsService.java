package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.FreelancerhasSkillDAOController;
import org.egreen.seed.openfreelancer.server.entity.FreelancerHasSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
@Service
public class FreelancerhasSkillsService {

    @Autowired
    private FreelancerhasSkillDAOController freelancerhasSkillDAOController;
   // private List<Skill> all;



    public Long save(List<Long> skills,long freelancerid) {
        Long aLong;
        for(int i=0;i<skills.size();i++){
            FreelancerHasSkill fsk= new FreelancerHasSkill();
            fsk.setFreelancerIdFreelancer(freelancerid);
            fsk.setSkillIdSkill(skills.get(i));
            freelancerhasSkillDAOController.create(fsk);
        }

        return 0L;
    }




   // public Long edit(List<Integer> skills,long freelancerid) {

 //       return (Long)freelancerhasSkillDAOController.update(freelancer);
  //  }

  //  public List<Integer> getskillsById(Long freelancerId) {

  //      return freelancerhasSkillDAOController.read(freelancerId);
  //  }

    public int deleteFreelancerById(Long freelancerId) {

        return 0;
    }


}
