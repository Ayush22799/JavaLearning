import CollectionsFramework.Map.LearnMap;
import CollectionsFramework.Queue.LearnQueue;
import CollectionsFramework.Set.LearnSet;
import CollectionsFramework.Stack.LearnStack;
import Java8.LamdaExp.Sum;
import ObjectOrientedProgramming.Abstraction.SBIBank;
import CollectionsFramework.List.ArrayList.arrayList;
import ObjectOrientedProgramming.Encapsulation.BankCustomer;
import ObjectOrientedProgramming.Inheritence.GermanShefard;
import ObjectOrientedProgramming.Polymorphism.MethodOverloading.Addition;
import ObjectOrientedProgramming.Polymorphism.MethodOverriding.Child;
import ObjectOrientedProgramming.Polymorphism.MethodOverriding.Parent;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//         System.out.println("\n Object Oriented Programming(OOPS) related tasks starts from here\n");


//    Task 1:
//      Inheritance();
//    Task 2:
//      Encapsulation();
//    Task 3:
//      Abstraction();
//    Task 4:
//      Polymorphism();


//        System.out.println("\n ---------------------Collection Framework related tasks starts from here-----------------------------\n");

//       List();
//       map();
//       set();
//       stack();
//       queue();

        System.out.println("\n ---------------------JAVA 8 related tasks starts from here-----------------------------\n");

        java8();


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
        System.out.println("---------- LIST RELATED TASKS STARTS FROM HERE ----------");

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
        System.out.println("\n\n---------- MAP RELATED TASKS STARTS FROM HERE ----------");

        LearnMap map = new LearnMap();

        //Task 1
        map.Task1();

        //Task 2
        map.Task2();

        //Task 3
        map.Task3();
    }
    public static void set(){
        System.out.println("\n\n---------- SET RELATED TASKS STARTS FROM HERE ----------");

        LearnSet set = new LearnSet();

        set.Task1();

        set.Task2();
    }
    public static void stack(){
        System.out.println("\n\n---------- STACK RELATED TASKS STARTS FROM HERE ----------");

        LearnStack stack = new LearnStack();

        stack.Task1();
    }
    public static void queue(){
        System.out.println("\n\n---------- QUEUE RELATED TASKS STARTS FROM HERE ----------");

        LearnQueue queue = new LearnQueue();

        queue.Task1();
    }
    public static void java8(){

        System.out.println("----LAMBDA TASK: \n");

        //in main method use lambda function to give implementation of method
        Sum s = (double a, double b) -> System.out.println(a+b);

        //print sum of 98.2+12.8 using method of functional interface.
        s.add(98.2, 12.8);

        System.out.println("\n----OPTIONAL TASK: \n");

        String name = "lokendra";

        //CREATE A OPTIONAL of string & insert value "lokendra"
        Optional<String> ifName = Optional.of(name);

        //check if value is present using optional method and print on console.
        if (ifName.isPresent()){
            System.out.println("Lokendra is Present");
        }
        else System.out.println("Lokendra is Absent. Submit Rs5000 fine to Pawan Patidar");

        System.out.println("\n----STREAM TASK: \n");

        //CREATE A LINKEDLIST WITH VALUES 1,2,3,4,5
        List<Integer> list = new LinkedList<>();
        for (int i = 5; i >= 1 ; i--) {
            list.add(i);
        }
        System.out.println("Initially list looks like: " + list.toString()+ "\n");

        System.out.println("--MAP(): \n");

        //Use map method of stream and add 1 to each value of linkedlist value and collect values of stream in list using collect(--) method of stream. then print the list.
        List<Integer> finalList = list.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println("After adding stream's map() function, list looks like: "+ finalList.toString());


        System.out.println("\n--Filter(): \n");

        //FILTER ALL EVEN NUMBERS IN THIS LINKEDLIST AND collect values of stream in list using collect(--) method of stream. then print the list.
        List<Integer> filterList = list.stream().filter(x-> x%2 ==0).collect(Collectors.toList());
        System.out.println("After adding stream's filter() function, list looks like: "+ filterList.toString());

        System.out.println("\n--Sorted(): \n");

        //use sorted method of stream and collect values of stream in list using collect(--) method of stream and print list on console.
        List<Integer> SortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("After adding stream's sort() function, list looks like: "+ SortedList.toString());

        System.out.println("\n--forEach(): \n");

        //use foreach method to print linkedlist values .
        System.out.println("Using stream's forEach() function, Printing initial List: ");
        list.stream().forEach(x-> System.out.println(x));

        System.out.println("\n--flatMap(): \n");

        // create 2d linkedlist

        List<String> bakeryList = new LinkedList();

        bakeryList.add("pasta");
        bakeryList.add("donut");

        List<String> productList = new LinkedList();

        productList.add("tomato");
        productList.add("pepper");

        List<List<String>> grocerylist = new LinkedList<>();

        grocerylist.add(bakeryList);
        grocerylist.add(productList);

        System.out.println("Initially 2D list looks like: \n"+ grocerylist.toString());

        List<String> lst = grocerylist.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

        System.out.println("\nAfter adding stream's flatMap() function, list looks like: \n"+ lst.toString());
    }

}