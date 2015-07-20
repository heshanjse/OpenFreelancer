package org.egreen.seed.openfreelancer.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
@Entity
@Table(name = "proposal")
@JsonIgnoreProperties
@IdClass(ProposalPK.class)
public class Proposal implements EntityInterface<Long>{
    private long idproposal;
    private String proposaltitle;
    private String description;
    private Double totalPrice;
    private Timestamp deadline;
    private long projectIdProject;
    private long freelancerIdFreelancer;
    private long acceptIdAccept;

    @Id
    @Column(name = "idproposal")
    public long getIdproposal() {
        return idproposal;
    }

    public void setIdproposal(long idproposal) {
        this.idproposal = idproposal;
    }

    @Basic
    @Column(name = "proposaltitle")
    public String getProposaltitle() {
        return proposaltitle;
    }

    public void setProposaltitle(String proposaltitle) {
        this.proposaltitle = proposaltitle;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "TotalPrice")
    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "deadline")
    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    @Id
    @Column(name = "Project_idProject")
    public long getProjectIdProject() {
        return projectIdProject;
    }

    public void setProjectIdProject(long projectIdProject) {
        this.projectIdProject = projectIdProject;
    }

    @Id
    @Column(name = "Freelancer_idFreelancer")
    public long getFreelancerIdFreelancer() {
        return freelancerIdFreelancer;
    }

    public void setFreelancerIdFreelancer(long freelancerIdFreelancer) {
        this.freelancerIdFreelancer = freelancerIdFreelancer;
    }

    @Id
    @Column(name = "Accept_idAccept")
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

        Proposal proposal = (Proposal) o;

        if (acceptIdAccept != proposal.acceptIdAccept) return false;
        if (freelancerIdFreelancer != proposal.freelancerIdFreelancer) return false;
        if (idproposal != proposal.idproposal) return false;
        if (projectIdProject != proposal.projectIdProject) return false;
        if (deadline != null ? !deadline.equals(proposal.deadline) : proposal.deadline != null) return false;
        if (description != null ? !description.equals(proposal.description) : proposal.description != null)
            return false;
        if (proposaltitle != null ? !proposaltitle.equals(proposal.proposaltitle) : proposal.proposaltitle != null)
            return false;
        if (totalPrice != null ? !totalPrice.equals(proposal.totalPrice) : proposal.totalPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idproposal ^ (idproposal >>> 32));
        result = 31 * result + (proposaltitle != null ? proposaltitle.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (int) (projectIdProject ^ (projectIdProject >>> 32));
        result = 31 * result + (int) (freelancerIdFreelancer ^ (freelancerIdFreelancer >>> 32));
        result = 31 * result + (int) (acceptIdAccept ^ (acceptIdAccept >>> 32));
        return result;
    }

    @Override
    @Transient
    public Long getId() {
        return getIdproposal();
    }

    @Override
    public String toString() {
        return "Proposal{" +
                "idproposal=" + getIdproposal()+
                ", proposaltitle='" + getProposaltitle()+ '\'' +
                ", description='" + getDescription() + '\'' +
                ", totalPrice='" + getTotalPrice() + '\'' +
                ", deadline='" + getDeadline() + '\'' +
                ", projectIdProject='" + getProjectIdProject() + '\'' +
                ", freelancerIdFreelancer='" + getFreelancerIdFreelancer() + '\'' +
                ", acceptIdAccept='" + getAcceptIdAccept() + '\'' +
                '}';


    }
}
