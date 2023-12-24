import Polymorphism.MethodOverloading.Addition;
import Polymorphism.MethodOverriding.Child;
import Polymorphism.MethodOverriding.Parent;

public class Main {
    public static void main(String[] args){

    //Inheritance related code (Task 1)
//        GermanShefard gs = new GermanShefard("Babu Khan", 3, "black");
//        gs.Running();
//        gs.Eating();
//        System.out.println("Name: " + gs.name + ", Age: " + gs.age + ", Color: " + gs.color);

    //Encapsulation related code (Task 2)
//        BankCustomer cust = new BankCustomer("lokendra", 12345678, 1, 23, 'M', 9876543210L);
//        System.out.println("Id: "+ cust.getId() +"\nName: " + cust.getName() + "\nAccount Number: " + cust.getAccountNumber() + "\nGender: " + cust.getGender() + "\nAge: " + cust.getAge() + "\nPhone Number: "+ cust.getPhoneNumber());

    //Abstraction related code (Task 3)
//        SBIBank sbi = new SBIBank();
//        System.out.println(sbi.rateOfInterest(50000,9,2));

    //Polymorphism related code (Task 4)
        Addition add = new Addition();
        add.Sum(1,2);
        add.Sum(1,2,3);

        Parent p = new Parent();
        p.Eating();

        Child c = new Child();
        c.Eating();
    }
}