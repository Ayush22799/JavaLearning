package CollectionsFramework.List.ArrayList;

import CollectionsFramework.List.LinkedList.Employee;

import java.util.*;

public class arrayList {
    public void task1(){
        System.out.println("\nTASK 1: \n");
        List<Integer> arr = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            arr.add(i);
        }
        System.out.println( "Initial Array List is: " + arr);

        arr.remove(2);

        System.out.println( "Element '3' is removed. Updated Array List is: " + arr);
    }

    public void task2(){
        System.out.println("\nTASK 2: \n");
        List<Integer> arr = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            arr.add(i);
        }
        System.out.println( "Initial Array List is: " + arr);

        Collections.sort(arr);

        System.out.println( "Sorted Array List is: " + arr);
    }

    public void task3(){
        System.out.println("\nTask 3: \n");

        List<Employee> list = new LinkedList<>();

        Employee<String, Integer> e1 = new Employee<>("Ayush", 24, 28000, "ASE (Accenture)");
        Employee<String, Integer> e2 = new Employee("Lokendra", 23, 75000, "Analyst (Cognizant)");
        Employee<String, Integer> e3 = new Employee("Faizal", 24, 26000, "Trainee (Mindtree)");
        Employee<String, Integer> e4 = new Employee("Praful", 24, 0, "Berozgar");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        System.out.println("Names of Employees are:");

        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.println(emp.getName());
        }
    }

    public void task4() {
        System.out.println("\nTask 4: \n");

        List<Integer> list1 = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(i + 1);
        }

        Iterator<Integer> integerIterator = list1.iterator();

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }



}
