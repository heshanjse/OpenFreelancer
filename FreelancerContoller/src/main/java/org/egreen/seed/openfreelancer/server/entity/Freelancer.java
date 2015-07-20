package org.egreen.seed.openfreelancer.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by heshanjayasinghe on 7/16/15.
 */
@Entity
@Table(name = "freelancer")
@JsonIgnoreProperties
public class Freelancer implements EntityInterface<Long> {
    private long idFreelancer;
    private String username;
    private String password;
    private Timestamp registetedDate;
    private String firstname;
    private String lastName;
    private String contactNo;
    private String address;
    private String accountNo;

    @Id
    @Column(name = "idFreelancer")
    public long getIdFreelancer() {
        return idFreelancer;
    }

    public void setIdFreelancer(long idFreelancer) {
        this.idFreelancer = idFreelancer;
    }

    @Basic
    @Column(name = "Username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "RegistetedDate")
    public Timestamp getRegistetedDate() {
        return registetedDate;
    }

    public void setRegistetedDate(Timestamp registetedDate) {
        this.registetedDate = registetedDate;
    }

    @Basic
    @Column(name = "Firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "ContactNo")
    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "AccountNo")
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Freelancer that = (Freelancer) o;

        if (idFreelancer != that.idFreelancer) return false;
        if (accountNo != null ? !accountNo.equals(that.accountNo) : that.accountNo != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (contactNo != null ? !contactNo.equals(that.contactNo) : that.contactNo != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (registetedDate != null ? !registetedDate.equals(that.registetedDate) : that.registetedDate != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idFreelancer ^ (idFreelancer >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (registetedDate != null ? registetedDate.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (contactNo != null ? contactNo.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (accountNo != null ? accountNo.hashCode() : 0);
        return result;
    }

    @Override
    @Transient
    public Long getId() {
        return getIdFreelancer();
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "idFreelancer=" + getIdFreelancer() +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", registetedDate='" + getRegistetedDate() + '\'' +
                ", firstname='" + getFirstname() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", contactNo='" + getContactNo() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", accountNo='" + getAccountNo() + '\'' +
                '}';


    }

}
