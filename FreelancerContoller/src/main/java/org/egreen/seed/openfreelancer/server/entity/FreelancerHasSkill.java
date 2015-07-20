package org.egreen.seed.openfreelancer.server.entity;

import javax.persistence.*;

/**
 * Created by heshanjayasinghe on 7/16/15.
 */
@Entity
@Table(name = "Freelancer_has_Skill", schema = "", catalog = "openfreelancer")
@IdClass(FreelancerHasSkillPK.class)
public class FreelancerHasSkill implements EntityInterface<FreelancerHasSkillPK> {
    private long freelancerIdFreelancer;
    private long skillIdSkill;
    private String more;

    @Id
    @Column(name = "Freelancer_idFreelancer")
    public long getFreelancerIdFreelancer() {
        return freelancerIdFreelancer;
    }

    public void setFreelancerIdFreelancer(long freelancerIdFreelancer) {
        this.freelancerIdFreelancer = freelancerIdFreelancer;
    }

    @Id
    @Column(name = "Skill_idSkill")
    public long getSkillIdSkill() {
        return skillIdSkill;
    }

    public void setSkillIdSkill(long skillIdSkill) {
        this.skillIdSkill = skillIdSkill;
    }

    @Basic
    @Column(name = "more")
    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FreelancerHasSkill that = (FreelancerHasSkill) o;

        if (freelancerIdFreelancer != that.freelancerIdFreelancer) return false;
        if (skillIdSkill != that.skillIdSkill) return false;
        if (more != null ? !more.equals(that.more) : that.more != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (freelancerIdFreelancer ^ (freelancerIdFreelancer >>> 32));
        result = 31 * result + (int) (skillIdSkill ^ (skillIdSkill >>> 32));
        result = 31 * result + (more != null ? more.hashCode() : 0);
        return result;
    }



    @Override
    @Transient
    public FreelancerHasSkillPK getId() {
        return new FreelancerHasSkillPK(getFreelancerIdFreelancer(),getSkillIdSkill());
    }
}
