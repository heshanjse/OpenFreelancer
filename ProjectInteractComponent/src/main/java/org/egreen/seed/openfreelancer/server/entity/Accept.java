package org.egreen.seed.openfreelancer.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
@Entity
@Table(name = "Accept")
@JsonIgnoreProperties
public class Accept implements EntityInterface<Long>{
    private long idAccept;
    private Byte accept;

    @Id
    @Column(name = "idAccept")
    public long getIdAccept() {
        return idAccept;
    }

    public void setIdAccept(long idAccept) {
        this.idAccept = idAccept;
    }

    @Basic
    @Column(name = "Accept")
    public Byte getAccept() {
        return accept;
    }

    public void setAccept(Byte accept) {
        this.accept = accept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accept accept1 = (Accept) o;

        if (idAccept != accept1.idAccept) return false;
        if (accept != null ? !accept.equals(accept1.accept) : accept1.accept != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idAccept ^ (idAccept >>> 32));
        result = 31 * result + (accept != null ? accept.hashCode() : 0);
        return result;
    }

    @Override
    @Transient
    public Long getId() {
        return getIdAccept();
    }

    @Override
    public String toString() {
        return "Accept{" +
                "idAccept=" + getIdAccept() +
                ", accept='" + getAccept() + '\'' +

                '}';


    }

}
