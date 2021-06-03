package ru.ibs.internship.backend.nar;

import java.util.*;
import java.util.stream.Collectors;

public class Department {

    public static void main(String[] args) {

        var ceo = new Employee("Игорь", "Стрельцов", 10) {
            private int yearOfAppointment; // год назначения на должность
            private boolean personalDriver; // наличие личного водителя

            public void signDocument(String document) {
                System.out.printf("Генеральный директор ставит подпись на документе \"%s\".%n", document);
            }

            @Override
            public void printInfo() {
                System.out.printf("Должность генерального директора исполняет %s %s.%n%n", this.getName(), this.getSurname());
            }

            public void setYearOfAppointment(int yearOfAppointment) {
                this.yearOfAppointment = yearOfAppointment;
            }
            public int getYearOfAppointment() {
                return this.yearOfAppointment;
            }
            public void setPersonalDriver(boolean personalDriver) {
                this.personalDriver = personalDriver;
            }
            public boolean getPersonalDriver() {
                return this.personalDriver;
            }

        };
        ceo.setPositionName("\"генеральный директор\"");
        Set<Employee> devSet = createHashSet();
        devSet.add(ceo);
        List<Employee> devList = createArrayList(devSet);
        /*System.out.println("Проверка Set:");
        printCollection(devSet); */

        List<Employee> filteredDevList = devList.stream().filter(el -> el.getWorkExperience() > 3)
                                                        .collect(Collectors.toList());
        System.out.printf("Проверка List:%n%n");
        printCollection(filteredDevList);

        devList.stream().map(el -> el.getSurname()).sorted(String::compareTo).forEach(System.out::println);

        devList.stream().sorted((el1, el2) -> el1.getWorkExperience() - el2.getWorkExperience())
                        .forEach(Employee::printWorkExperience);

        //ceo.signDocument("Договор №1");
    }

    public static Set<Employee> createHashSet() {
        Set<Employee> developmentSet = new HashSet<>();
        developmentSet.add(new Trainee("Иван", "Иванов", true, 0));
        developmentSet.add(new Trainee("Яна", "Орлова", true, 0));
        developmentSet.add(new Trainee("Пётр", "Соловьёв", false, 0));
        developmentSet.add(new Developer("Олег", "Петров", 2, false, 1));
        developmentSet.add(new Developer("Юлия", "Павлова", 2, false, 1));
        developmentSet.add(new Developer("Илья", "Колмановский", 3, false, 5));
        developmentSet.add(new Developer("Ася", "Казанцева", 3, true, 3));
        developmentSet.add(new Developer("Алексей", "Пивоваров", 2, true, 5));
        developmentSet.add(new Developer("Виктор", "Комаров", 3, false, 2));
        developmentSet.add(new Developer("Ирина", "Шихман", 2, false, 4));
        developmentSet.add(new TeamLead("Виктор", "Андреев", "Internship", 10, 7));
        return developmentSet;
    }

    public static List<Employee> createArrayList(Set<Employee> developmentSet) {
        List<Employee> developmentList = new ArrayList<>();
        for (Employee emp : developmentSet) {
            developmentList.add(emp);
        }
        return developmentList;
    }

    public static void printCollection(Collection<Employee> coll) {
        for (Employee emp : coll) {
            emp.printInfo();
            if (emp instanceof Trainee) {
                ((Trainee) emp).doHomework("Java");
                System.out.println("");
            } else if (emp instanceof Developer) {
                ((Developer) emp).doProject("Internship");
                System.out.println("");
            } else if (emp instanceof TeamLead) {
                ((TeamLead) emp).leadProject("Internship");
                System.out.println("");
            }
        }
    }
}
