package org.egreen.seed.openfreelancer.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by heshanjayasinghe on 7/16/15.
 */
@Entity
@Table(name = "skill")
@JsonIgnoreProperties
public class Skill implements EntityInterface<Long>{
    private long idSkill;
    private String skilltitle;

    @Id
    @Column(name = "idSkill")
    public long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(long idSkill) {
        this.idSkill = idSkill;
    }

    @Basic
    @Column(name = "Skilltitle")
    public String getSkilltitle() {
        return skilltitle;
    }

    public void setSkilltitle(String skilltitle) {
        this.skilltitle = skilltitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skill skill = (Skill) o;

        if (idSkill != skill.idSkill) return false;
        if (skilltitle != null ? !skilltitle.equals(skill.skilltitle) : skill.skilltitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idSkill ^ (idSkill >>> 32));
        result = 31 * result + (skilltitle != null ? skilltitle.hashCode() : 0);
        return result;
    }



    @Override
    @Transient
    public Long getId() {
        return getIdSkill();
    }

    @Override
    public String toString() {
        return "Skill{" +
                "idSkill=" + getIdSkill() +
                ", skilltitle='" + getSkilltitle() + '\'' +

                '}';


    }
}
