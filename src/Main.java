import Abstraction.SBIBank;
import CollectionsFramework.List.LinkedList.Employee;
import CollectionsFramework.List.arrayList;
import Encapsulation.BankCustomer;
import Inheritence.GermanShefard;
import Polymorphism.MethodOverloading.Addition;
import Polymorphism.MethodOverriding.Child;
import Polymorphism.MethodOverriding.Parent;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      /* Object Oriented Programming(OOPS) related tasks starts from here */

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

        //List:
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
        //Task 1:
        arrayList arr = new arrayList();
        arr.task1();
        arr.task2();

        //Task 2:
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        LinkedList<String> employees = new LinkedList<>();

        System.out.println("\nTask 3:");
        System.out.println("\nPlease enter names of 10 Employees:\n");
        for (int i = 0; i < 10; i++) {
            emp.name = sc.next();
            employees.add(emp.name);
        }

        System.out.println("Name of Employees are: " + employees);

    }
}