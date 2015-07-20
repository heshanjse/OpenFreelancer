package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.MilestoneDAOController;
import org.egreen.seed.openfreelancer.server.entity.Milestone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class MilestoneDAOService {

@Autowired
private MilestoneDAOController milestoneDAOController;




public Long save(Milestone milestone) {
long Milestone_id = new Date().getTime();
 milestone.setIdMilestone(Milestone_id);


Long aLong = milestoneDAOController.create(milestone);
return aLong;
}


public List<Milestone> getAll() {
return milestoneDAOController.getAll();
}

public Long edit(Milestone milestone) {

return  milestoneDAOController.update(milestone);
}

public int deleteMilestoneById(Long MilestoneId) {
return 0;
}

public Milestone getMilestoneById(Long MilestoneId) {
return  milestoneDAOController.read(MilestoneId);
}
}