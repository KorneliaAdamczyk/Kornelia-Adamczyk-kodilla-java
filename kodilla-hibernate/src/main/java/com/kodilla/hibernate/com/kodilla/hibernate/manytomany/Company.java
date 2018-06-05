package com.kodilla.hibernate.com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/*@NamedNativeQuery(
        name = "Company.retrieveCompanyBeginWithThreeLetters",
        query = "SELECT * FROM COMPANIES WHERE LEFT (COMPANY_NAME,3) = :THREELETTERS",
       resultClass = Company.class
)*/
@NamedQuery(
        name = "Company.search",
        query = " SELECT c FROM Company c WHERE c.name LIKE CONCAT('%', :arg)")

@Component
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}