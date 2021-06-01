package ru.ibs.internship.backend.nar;

import java.util.*;

public class Department {
    public static void main(String[] args) {
        Set<Employee> devSet = createHashSet();
        List<Employee> devList = createArrayList(devSet);
        System.out.println("Проверка Set:");
        printCollection(devSet);
        System.out.println("Проверка List:");
        printCollection(devList);
    }
    public static Set<Employee> createHashSet() {
        Set<Employee> developmentSet = new HashSet<>();
        developmentSet.add(new Trainee("Иван", "Иванов", true));
        developmentSet.add(new Developer("Олег", "Олегович", 2, true));
        developmentSet.add(new TeamLead("Виктор", "Викторович", "Internship", 11));
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
            } else if (emp instanceof Developer) {
                ((Developer) emp).doProject("Internship");
            } else if (emp instanceof TeamLead) {
                ((TeamLead) emp).leadProject("Internship");
            }
        }
    }
}
