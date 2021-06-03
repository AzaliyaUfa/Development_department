package ru.ibs.internship.backend.nar;

public class TeamLead extends Employee implements Manager {

    private String projectName;
    private Integer numberOfEmployees;

    public TeamLead() {
    }

    public TeamLead(String name, String surname, String projectName, Integer numberOfEmployees, Integer workExperience) {
        this.setName(name);
        this.setSurname(surname);
        this.numberOfEmployees = numberOfEmployees;
        this.projectName = projectName;
        this.setWorkExperience(workExperience);
    }

    public TeamLead(String name, String surname, Integer workExperience, Double salary, Integer numberOfEmployees, String projectName) {
        this.setName(name);
        this.setSurname(surname);
        this.setWorkExperience(workExperience);
        this.setSalary(salary);
        this.numberOfEmployees = numberOfEmployees;
        this.projectName = projectName;
    }

    @Override
    public void printInfo() {
        System.out.printf("Teamlead %s %s руководит проектом %s, ", this.getSurname(), this.getName(), this.getProjectName());
        System.out.printf("в его отделе %d человек.%n", this.getNumberOfEmployees());
    }

    public void leadProject(String project) {
        System.out.printf("Статус на текущий момент: курирует проект %s.%n", project);
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    @Override
    public void giveTask() {
        System.out.println("Список заданий");
    }
    @Override
    public boolean controlTask() {
        if(true) {
            return true;
        } else {
            return false;
        }
    }
}
