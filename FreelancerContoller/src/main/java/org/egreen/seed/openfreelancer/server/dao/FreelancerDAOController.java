package org.egreen.seed.openfreelancer.server.dao;


import org.egreen.seed.openfreelancer.server.entity.Freelancer;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
public interface FreelancerDAOController extends DAOController<Freelancer,Long> {

    Boolean checklogin(String username, String password);
}
