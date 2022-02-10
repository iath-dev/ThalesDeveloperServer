package com.jdnl.ThalesDeveloperServer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name = "employee_age")
    private Integer employee_age;

    @Column(name = "employee_salary")
    private Integer employee_salary;

    private Integer employee_annual_salary;

    @Column(name = "profile_image")
    private String profile_image = "";

    public Employee() {

    }

    public Employee(String name, Integer age, Integer salary) {
        super();
        this.employee_name = name;
        this.employee_age = age;
        this.employee_salary = salary;
        this.employee_annual_salary = salary * 12;
    }

    public long getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public Integer getEmployee_age() {
        return employee_age;
    }

    public Integer getEmployee_salary() {
        return employee_salary;
    }

    public Integer getEmployee_annual_salary() {
        return employee_annual_salary;
    }

    public String getProfile_image() {
        return profile_image;
    }
}
