package org.egreen.seed.openfreelancer.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
@Entity
@Table(name = "category")
@JsonIgnoreProperties
public class Category implements EntityInterface<Long>{
    private long idcategory;
    private String title;
    private String description;

    @Id
    @Column(name = "idcategory")
    public long getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(long idcategory) {
        this.idcategory = idcategory;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (idcategory != category.idcategory) return false;
        if (description != null ? !description.equals(category.description) : category.description != null)
            return false;
        if (title != null ? !title.equals(category.title) : category.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idcategory ^ (idcategory >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
    @Override
    @Transient
    public Long getId() {
        return getIdcategory();
    }

    @Override
    public String toString() {
        return "category{" +
                "idcategory=" + getIdcategory() +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';


    }

}
