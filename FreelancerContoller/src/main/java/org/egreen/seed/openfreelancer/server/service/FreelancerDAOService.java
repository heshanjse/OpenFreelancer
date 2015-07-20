package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.FreelancerDAOController;


import org.egreen.seed.openfreelancer.server.entity.Freelancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */
@Service
public class FreelancerDAOService {

    @Autowired
    private FreelancerDAOController freelancerDAOController;
    private List<Freelancer> all;


    /**
     *
     * Customer SignUp
     *
     * @param freelancer
     * @return
     */
    public Long save(Freelancer freelancer) {
        long Freelancer_id = new Date().getTime();
        freelancer.setIdFreelancer(Freelancer_id);


        Long aLong = freelancerDAOController.create(freelancer);
        return aLong;
    }


    public List<Freelancer> getAll() {

        return freelancerDAOController.getAll();
    }

    public Long edit(Freelancer freelancer) {

        return (Long)freelancerDAOController.update(freelancer);
    }

    public Freelancer getFreelancerById(Long freelancerId) {

        return freelancerDAOController.read(freelancerId);
    }

    public int deleteFreelancerById(Long freelancerId) {

        return 0;
    }

    public Boolean checklogin(String username,String password) {
        return freelancerDAOController.checklogin(username,password);

    }
}
