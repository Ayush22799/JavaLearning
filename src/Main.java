import ObjectOrientedProgramming.Abstraction.SBIBank;
import CollectionsFramework.List.LinkedList.Employee;
import CollectionsFramework.List.ArrayList.arrayList;
import ObjectOrientedProgramming.Encapsulation.BankCustomer;
import ObjectOrientedProgramming.Inheritence.GermanShefard;
import ObjectOrientedProgramming.Polymorphism.MethodOverloading.Addition;
import ObjectOrientedProgramming.Polymorphism.MethodOverriding.Child;
import ObjectOrientedProgramming.Polymorphism.MethodOverriding.Parent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
      // Object Oriented Programming(OOPS) related tasks starts from here
    /*
    Task 1:
      Inheritance();
    Task 2:
      Encapsulation();
    Task 3:
      Abstraction();
    Task 4:
      Polymorphism();
    /*

      /*Collection Framework related tasks starts from here */
        List();

    }
    public static void Inheritance(){
        GermanShefard gs = new GermanShefard("Babu Khan", 3, "black");
        gs.Running();
        gs.Eating();
        System.out.println("Name: " + gs.name + ", Age: " + gs.age + ", Color: " + gs.color);
    }
    public static void Encapsulation(){
        BankCustomer cust = new BankCustomer("lokendra", 12345678, 1, 23, 'M', 9876543210L);
        System.out.println("Id: "+ cust.getId() +"\nName: " + cust.getName() + "\nAccount Number: " + cust.getAccountNumber() + "\nGender: " + cust.getGender() + "\nAge: " + cust.getAge() + "\nPhone Number: "+ cust.getPhoneNumber());

    }
    public static void Abstraction(){
        SBIBank sbi = new SBIBank();
        System.out.println(sbi.rateOfInterest(50000,9,2));
    }

    public static void Polymorphism(){
        Addition add = new Addition();
        add.Sum(1,2);
        add.Sum(1,2,3);

        Parent p = new Parent();
        p.Eating();

        Child c = new Child();
        c.Eating();
    }

    public static void List(){
        arrayList arr = new arrayList();

        //Task 1:
        arr.task1();
        //Task 2:
        arr.task2();

        //Task 3:
        System.out.println("\nTask 3: \n");

        List<Employee> list = new LinkedList<Employee>();

        Employee<String, Integer> e1 = new Employee<>("Ayush",24,28000,"ASE (Accenture)");
        Employee<String, Integer> e2 = new Employee("Lokendra",23,75000,"Analyst (Cognizant)");
        Employee<String, Integer> e3 = new Employee("Faizal",24,26000,"Trainee (Mindtree)");
        Employee<String, Integer> e4 = new Employee("Praful",24,0,"Berozgar");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        System.out.println("Names of Employees are:" );

        Iterator<Employee> it = list.iterator();

        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.getName());
        }

        //Task 4:
        System.out.println("\nTask 4: \n");

        List<Integer> list1 = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(i+1);
        }

        Iterator<Integer> integerIterator = list1.iterator();

        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
        }
    }