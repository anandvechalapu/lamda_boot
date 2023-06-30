package com.sacral.lamda.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "spouse")
public class Spouse {

    @Id
    @Column(name = "spouse_id")
    private Long id;

    @Column(name = "cust_id")
    private Long custId;

    @Column(name = "dob")
    private String dob;

    @Column(name = "crif")
    private String crif;

    @Column(name = "credit_score")
    private Integer creditScore;

    @Column(name = "age")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCrif() {
        return crif;
    }

    public void setCrif(String crif) {
        this.crif = crif;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}