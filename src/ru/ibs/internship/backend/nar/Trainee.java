package ru.ibs.internship.backend.nar;

public class Trainee extends Employee {

    private String curatorName;
    private boolean internshipPassed;

    public Trainee() {
    }

    public Trainee(String name, String surname, boolean internshipPassed, Integer workExperience) {
        this.setName(name);
        this.setSurname(surname);
        this.internshipPassed = internshipPassed;
        this.setWorkExperience(workExperience);
    }

    public Trainee(String name, String surname, Integer workExperience, Double salary, String curatorName, boolean internshipPassed) {
        this.setName(name);
        this.setSurname(surname);
        this.setWorkExperience(workExperience);
        this.setSalary(salary);
        this.curatorName = curatorName;
        this.internshipPassed = internshipPassed;
    }

    @Override
    public void printInfo() {
        if (this.internshipPassed) {
            System.out.printf("Стажёр %s %s стажировку прошёл успешно.%n", this.getSurname(), this.getName());
        } else {
            System.out.printf("Стажёр %s %s стажировку не прошёл.%n", this.getSurname(), this.getName());
        }
    }

    public void doHomework(String task) {
        System.out.printf("Статус на текущий момент: делает домашнее задание %s.%n", task);
    }

    public void setCuratorName(String curatorName) {
        this.curatorName = curatorName;
    }
    public String getCuratorName() {
        return this.curatorName;
    }
    public void setInternshipPassed(boolean internshipPassed) {
        this.internshipPassed = internshipPassed;
    }
    public boolean getInternshipPassed() {
        return this.internshipPassed;
    }
}
