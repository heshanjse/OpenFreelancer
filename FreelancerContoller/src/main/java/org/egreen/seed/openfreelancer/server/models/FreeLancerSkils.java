package org.egreen.seed.openfreelancer.server.models;

import org.egreen.seed.openfreelancer.server.entity.Freelancer;

import java.util.List;

/**
 * Created by heshanjayasinghe on 7/10/15.
 */
public class FreeLancerSkils {

    private Freelancer freelancer;
    private List<Long> integerList;


    public FreeLancerSkils() {
    }

    public FreeLancerSkils(Freelancer freelancer, List<Long> integerList) {
        this.freelancer = freelancer;
        this.integerList = integerList;
    }


    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public List<Long> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Long> integerList) {
        this.integerList = integerList;
    }
}
