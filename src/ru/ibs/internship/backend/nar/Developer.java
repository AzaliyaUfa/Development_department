package ru.ibs.internship.backend.nar;

public class Developer extends Employee {
    private Integer numberOfProjects;
    private boolean haveAnIntern;

    public Developer() {
    }

    public Developer(String name, String surname, Integer numberOfProjects, boolean haveAnIntern) {
        this.setName(name);
        this.setSurname(surname);
        this.numberOfProjects = numberOfProjects;
        this.haveAnIntern = haveAnIntern;
    }

    public Developer(String name, String surname, Integer workExperience, Double salary, Integer numberOfProjects, boolean haveAnIntern) {
        this.setName(name);
        this.setSurname(surname);
        this.setWorkExperience(workExperience);
        this.setSalary(salary);
        this.numberOfProjects = numberOfProjects;
        this.haveAnIntern = haveAnIntern;
    }

    @Override
    public void printInfo() {
        System.out.printf("Разработчик %s %s участвует в %d проектах, ", this.getSurname(), this.getName(), this.getNumberOfProjects());
        if (this.haveAnIntern) {
            System.out.println("у него есть закреплённый за ним стажёр.");
        } else {
            System.out.println("у него нет закреплённого за ним стажёра.");
        }
    }

    public void doProject(String project) {
        System.out.printf("Статус на текущий момент: разрабатывает проект %s.%n", project);
    }

    public void setHaveAnIntern(boolean haveAnIntern) {
        this.haveAnIntern = haveAnIntern;
    }

    public boolean getHaveAnIntern() {
        return this.haveAnIntern;
    }

    public void setNumberOfProjects(Integer numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    public Integer getNumberOfProjects() {
        return this.numberOfProjects;
    }



}
