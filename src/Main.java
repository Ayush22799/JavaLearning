import CollectionsFramework.Map.LearnMap;
import ObjectOrientedProgramming.Abstraction.SBIBank;
import CollectionsFramework.List.ArrayList.arrayList;
import ObjectOrientedProgramming.Encapsulation.BankCustomer;
import ObjectOrientedProgramming.Inheritence.GermanShefard;
import ObjectOrientedProgramming.Polymorphism.MethodOverloading.Addition;
import ObjectOrientedProgramming.Polymorphism.MethodOverriding.Child;
import ObjectOrientedProgramming.Polymorphism.MethodOverriding.Parent;

public class Main {
    public static void main(String[] args) {
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

//       List();
         map();
    }

    public static void Inheritance() {
        GermanShefard gs = new GermanShefard("Babu Khan", 3, "black");
        gs.Running();
        gs.Eating();
        System.out.println("Name: " + gs.name + ", Age: " + gs.age + ", Color: " + gs.color);
    }

    public static void Encapsulation() {
        BankCustomer cust = new BankCustomer("lokendra", 12345678, 1, 23, 'M', 9876543210L);
        System.out.println("Id: " + cust.getId() + "\nName: " + cust.getName() + "\nAccount Number: " + cust.getAccountNumber() + "\nGender: " + cust.getGender() + "\nAge: " + cust.getAge() + "\nPhone Number: " + cust.getPhoneNumber());

    }

    public static void Abstraction() {
        SBIBank sbi = new SBIBank();
        System.out.println(sbi.rateOfInterest(50000, 9, 2));
    }

    public static void Polymorphism() {
        Addition add = new Addition();
        add.Sum(1, 2);
        add.Sum(1, 2, 3);

        Parent p = new Parent();
        p.Eating();

        Child c = new Child();
        c.Eating();
    }

    public static void List() {
        arrayList arr = new arrayList();

        //Task 1:
        arr.task1();

        //Task 2:
        arr.task2();

        //Task 3:
        arr.task3();

        //Task 4:
        arr.task4();
    }

    public static void map() {

        LearnMap map = new LearnMap();

        //Task 1
        map.Task1();

        //Task 2
        map.Task2();

        //Task 3
        map.Task3();
    }
}