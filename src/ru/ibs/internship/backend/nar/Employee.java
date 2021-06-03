package ru.ibs.internship.backend.nar;

public abstract class Employee {

    private String positionName;
    private String name;
    private String surname;
    private Integer workExperience; // в годах
    private Double salary;

    public Employee() {
    }
    public Employee(String name, String surname, Integer workExperience) {
        this.setName(name);
        this.setSurname(surname);
        this.setWorkExperience(workExperience);
    }

    public abstract void printInfo();
    public void printWorkExperience() {
        System.out.printf("Сотрудник %s %s на должности %s имеет опыт работы %d (года/лет).%n"
                            , this.getName(), this.getSurname(), this.getPositionName(), this.getWorkExperience());
    }

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
    public void setPositionName(String positionName) {
        this.positionName = positionName;
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
    public String getPositionName() {
        if (this instanceof Trainee) {
            this.positionName = "\"cтажёр\"";
        } else if (this instanceof Developer) {
            this.positionName = "\"разработчик\"";
        } else if (this instanceof TeamLead) {
            this.positionName = "\"TeamLead\"";
        }
        return this.positionName;
    }

}
