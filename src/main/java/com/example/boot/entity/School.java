package com.example.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Null;
import java.util.Set;

@Entity
@Table(name="school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schId;
    @Column
    private String schName;
    @Column
    private String schAdress;
    @OneToMany(targetEntity = Student.class,fetch = FetchType.LAZY,mappedBy = "sch")
    private Set<Student> stus;

    public Long getSchId() {
        return schId;
    }

    public void setSchId(Long schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchAdress() {
        return schAdress;
    }

    public void setSchAdress(String schAdress) {
        this.schAdress = schAdress;
    }

    public Set<Student> getStus() {
        return stus;
    }

    public void setStus(Set<Student> stus) {
        this.stus = stus;
    }
}
