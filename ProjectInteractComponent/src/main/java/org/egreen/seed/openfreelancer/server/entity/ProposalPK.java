package org.egreen.seed.openfreelancer.server.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
public class ProposalPK implements Serializable {
    private long idproposal;

    @Column(name = "idproposal")
    @Id
    public long getIdproposal() {
        return idproposal;
    }

    public void setIdproposal(long idproposal) {
        this.idproposal = idproposal;
    }

    private long projectIdProject;

    @Column(name = "Project_idProject")
    @Id
    public long getProjectIdProject() {
        return projectIdProject;
    }

    public void setProjectIdProject(long projectIdProject) {
        this.projectIdProject = projectIdProject;
    }

    private long freelancerIdFreelancer;

    @Column(name = "Freelancer_idFreelancer")
    @Id
    public long getFreelancerIdFreelancer() {
        return freelancerIdFreelancer;
    }

    public void setFreelancerIdFreelancer(long freelancerIdFreelancer) {
        this.freelancerIdFreelancer = freelancerIdFreelancer;
    }

    private long acceptIdAccept;

    @Column(name = "Accept_idAccept")
    @Id
    public long getAcceptIdAccept() {
        return acceptIdAccept;
    }

    public void setAcceptIdAccept(long acceptIdAccept) {
        this.acceptIdAccept = acceptIdAccept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProposalPK that = (ProposalPK) o;

        if (acceptIdAccept != that.acceptIdAccept) return false;
        if (freelancerIdFreelancer != that.freelancerIdFreelancer) return false;
        if (idproposal != that.idproposal) return false;
        if (projectIdProject != that.projectIdProject) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idproposal ^ (idproposal >>> 32));
        result = 31 * result + (int) (projectIdProject ^ (projectIdProject >>> 32));
        result = 31 * result + (int) (freelancerIdFreelancer ^ (freelancerIdFreelancer >>> 32));
        result = 31 * result + (int) (acceptIdAccept ^ (acceptIdAccept >>> 32));
        return result;
    }
}
