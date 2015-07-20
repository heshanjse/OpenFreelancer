package org.egreen.seed.openfreelancer.server.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by heshanjayasinghe on 7/16/15.
 */
public class FreelancerHasSkillPK implements Serializable {
    private long freelancerIdFreelancer;
    private long skillIdSkill;

    public FreelancerHasSkillPK(long freelancerIdFreelancer, long skillIdSkill) {
        this.freelancerIdFreelancer = freelancerIdFreelancer;
        this.skillIdSkill = skillIdSkill;
    }

    public FreelancerHasSkillPK() {
    }

    @Column(name = "Freelancer_idFreelancer")
    @Id
    public long getFreelancerIdFreelancer() {
        return freelancerIdFreelancer;
    }

    public void setFreelancerIdFreelancer(long freelancerIdFreelancer) {
        this.freelancerIdFreelancer = freelancerIdFreelancer;
    }

    @Column(name = "Skill_idSkill")
    @Id
    public long getSkillIdSkill() {
        return skillIdSkill;
    }

    public void setSkillIdSkill(long skillIdSkill) {
        this.skillIdSkill = skillIdSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FreelancerHasSkillPK that = (FreelancerHasSkillPK) o;

        if (freelancerIdFreelancer != that.freelancerIdFreelancer) return false;
        if (skillIdSkill != that.skillIdSkill) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (freelancerIdFreelancer ^ (freelancerIdFreelancer >>> 32));
        result = 31 * result + (int) (skillIdSkill ^ (skillIdSkill >>> 32));
        return result;
    }
}
