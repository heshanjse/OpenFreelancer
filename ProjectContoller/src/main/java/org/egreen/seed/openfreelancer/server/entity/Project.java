package org.egreen.seed.openfreelancer.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by heshanjayasinghe on 7/14/15.
 */
@Entity
@Table(name = "Project")
@JsonIgnoreProperties
@IdClass(ProjectPK.class)
public class Project implements EntityInterface<Long>{
    private long idProject;
    private String projectName;
    private String description;
    private String requiredSkills;
    private String addFile;
    private Double upperLimit;
    private Double lowerLimit;
    private String priceUnit;
    private Date deadline;
    private long categoryIdcategory;


    @Id
    @Column(name = "idProject")
    public long getIdProject() {
        return idProject;
    }

    public void setIdProject(long idProject) {
        this.idProject = idProject;
    }

    @Basic
    @Column(name = "ProjectName")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
    @Column(name = "RequiredSkills")
    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    @Basic
    @Column(name = "AddFile")
    public String getAddFile() {
        return addFile;
    }

    public void setAddFile(String addFile) {
        this.addFile = addFile;
    }

    @Basic
    @Column(name = "UpperLimit")
    public Double getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Basic
    @Column(name = "LowerLimit")
    public Double getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    @Basic
    @Column(name = "PriceUnit")
    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    @Basic
    @Column(name = "Deadline")
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Id
    @Column(name = "category_idcategory")
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

        Project project = (Project) o;


        if (categoryIdcategory != project.categoryIdcategory) return false;
        if (idProject != project.idProject) return false;
        if (addFile != null ? !addFile.equals(project.addFile) : project.addFile != null) return false;
        if (deadline != null ? !deadline.equals(project.deadline) : project.deadline != null) return false;
        if (description != null ? !description.equals(project.description) : project.description != null) return false;
        if (lowerLimit != null ? !lowerLimit.equals(project.lowerLimit) : project.lowerLimit != null) return false;
        if (priceUnit != null ? !priceUnit.equals(project.priceUnit) : project.priceUnit != null) return false;
        if (projectName != null ? !projectName.equals(project.projectName) : project.projectName != null) return false;
        if (requiredSkills != null ? !requiredSkills.equals(project.requiredSkills) : project.requiredSkills != null)
            return false;
        if (upperLimit != null ? !upperLimit.equals(project.upperLimit) : project.upperLimit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idProject ^ (idProject >>> 32));
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (requiredSkills != null ? requiredSkills.hashCode() : 0);
        result = 31 * result + (addFile != null ? addFile.hashCode() : 0);
        result = 31 * result + (upperLimit != null ? upperLimit.hashCode() : 0);
        result = 31 * result + (lowerLimit != null ? lowerLimit.hashCode() : 0);
        result = 31 * result + (priceUnit != null ? priceUnit.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (int) (categoryIdcategory ^ (categoryIdcategory >>> 32));
        return result;
    }

    @Override
    @Transient
    public Long getId() {
        return getIdProject();
    }

    @Override
    public String toString() {
        return "Project{" +
                "idProject=" + getIdProject() +
                ", projectName='" + getProjectName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", requiredSkills='" + getRequiredSkills() + '\'' +
                ", addFile='" + getAddFile() + '\'' +
                ", upperLimit='" + getUpperLimit() + '\'' +
                ", lowerLimit='" + getLowerLimit() + '\'' +
                ", priceUnit='" + getPriceUnit() + '\'' +
                ", deadline='" + getDeadline() + '\'' +
                ", categoryIdcategory='" + getCategoryIdcategory() + '\'' +

                '}';


    }
}
