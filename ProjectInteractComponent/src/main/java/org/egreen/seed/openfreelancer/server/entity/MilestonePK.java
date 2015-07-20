package org.egreen.seed.openfreelancer.server.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
public class MilestonePK implements Serializable {
    private long idMilestone;
    private long proposalIdproposal;

    @Column(name = "idMilestone")
    @Id
    public long getIdMilestone() {
        return idMilestone;
    }

    public void setIdMilestone(long idMilestone) {
        this.idMilestone = idMilestone;
    }

    @Column(name = "proposal_idproposal")
    @Id
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

        MilestonePK that = (MilestonePK) o;

        if (idMilestone != that.idMilestone) return false;
        if (proposalIdproposal != that.proposalIdproposal) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idMilestone ^ (idMilestone >>> 32));
        result = 31 * result + (int) (proposalIdproposal ^ (proposalIdproposal >>> 32));
        return result;
    }
}
