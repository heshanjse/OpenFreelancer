package org.egreen.seed.openfreelancer.server.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
public class ProjectPK implements Serializable {
    private long idProject;
    private long categoryIdcategory;


    @Column(name = "idProject")
    @Id
    public long getIdProject() {
        return idProject;
    }

    public void setIdProject(long idProject) {
        this.idProject = idProject;
    }

    @Column(name = "category_idcategory")
    @Id
    public long getCategoryIdcategory() {
        return categoryIdcategory;
    }

    public void setCategoryIdcategory(long categoryIdcategory) {
        this.categoryIdcategory = categoryIdcategory;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectPK projectPK = (ProjectPK) o;

        if (categoryIdcategory != projectPK.categoryIdcategory) return false;
        if (idProject != projectPK.idProject) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idProject ^ (idProject >>> 32));
        result = 31 * result + (int) (categoryIdcategory ^ (categoryIdcategory >>> 32));

        return result;
    }
}
