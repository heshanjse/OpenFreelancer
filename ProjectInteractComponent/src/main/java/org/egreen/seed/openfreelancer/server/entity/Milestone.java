package org.egreen.seed.openfreelancer.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
@Entity
@Table(name = "Milestone")
@JsonIgnoreProperties
@IdClass(MilestonePK.class)
public class Milestone implements EntityInterface<Long>{
    private long idMilestone;
    private String activity;
    private String description;
    private Date deadline;
    private String milestonefee;
    private String companyAcceptedStatus;
    private long proposalIdproposal;

    @Id
    @Column(name = "idMilestone")
    public long getIdMilestone() {
        return idMilestone;
    }

    public void setIdMilestone(long idMilestone) {
        this.idMilestone = idMilestone;
    }

    @Basic
    @Column(name = "Activity")
    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
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
    @Column(name = "Deadline")
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "Milestonefee")
    public String getMilestonefee() {
        return milestonefee;
    }

    public void setMilestonefee(String milestonefee) {
        this.milestonefee = milestonefee;
    }

    @Basic
    @Column(name = "CompanyAcceptedStatus")
    public String getCompanyAcceptedStatus() {
        return companyAcceptedStatus;
    }

    public void setCompanyAcceptedStatus(String companyAcceptedStatus) {
        this.companyAcceptedStatus = companyAcceptedStatus;
    }

    @Id
    @Column(name = "proposal_idproposal")
    public long getProposalIdproposal() {
        return proposalIdproposal;
    }

    public void setProposalIdproposal(long proposalIdproposal) {
        this.proposalIdproposal = proposalIdproposal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Milestone milestone = (Milestone) o;

        if (idMilestone != milestone.idMilestone) return false;
        if (proposalIdproposal != milestone.proposalIdproposal) return false;
        if (activity != null ? !activity.equals(milestone.activity) : milestone.activity != null) return false;
        if (companyAcceptedStatus != null ? !companyAcceptedStatus.equals(milestone.companyAcceptedStatus) : milestone.companyAcceptedStatus != null)
            return false;
        if (deadline != null ? !deadline.equals(milestone.deadline) : milestone.deadline != null) return false;
        if (description != null ? !description.equals(milestone.description) : milestone.description != null)
            return false;
        if (milestonefee != null ? !milestonefee.equals(milestone.milestonefee) : milestone.milestonefee != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idMilestone ^ (idMilestone >>> 32));
        result = 31 * result + (activity != null ? activity.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (milestonefee != null ? milestonefee.hashCode() : 0);
        result = 31 * result + (companyAcceptedStatus != null ? companyAcceptedStatus.hashCode() : 0);
        result = 31 * result + (int) (proposalIdproposal ^ (proposalIdproposal >>> 32));
        return result;
    }

    @Override
    @Transient
    public Long getId() {
        return getIdMilestone();
    }

    @Override
    public String toString() {
        return "Milestone{" +
                "idMilestone=" + getIdMilestone() +
                ", activity='" + getActivity() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", deadline='" + getDeadline() + '\'' +
                ", milestonefee='" + getMilestonefee() + '\'' +
                ", companyAcceptedStatus='" + getCompanyAcceptedStatus() + '\'' +
                ", proposalIdproposal='" + getProposalIdproposal() + '\'' +
                '}';


    }
}
