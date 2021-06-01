package ru.ibs.internship.backend.nar;

public abstract class Employee {
    private String name;
    private String surname;
    private Integer workExperience;
    private Double salary;

    public Employee() {
    }

    public void printInfo() {}

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public Integer getWorkExperience() {
        return this.workExperience;
    }
    public Double getSalary() {
        return this.salary;
    }

}
