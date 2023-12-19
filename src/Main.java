import Encapsulation.BankCustomer;
import Inheritence.GermanShefard;

public class Main {
    public static void main(String[] args){

    //Inheritance related code (Task 1)
//        GermanShefard gs = new GermanShefard("Babu Khan", 3, "black");
//        gs.Running();
//        gs.Eating();
//        System.out.println("Name: " + gs.name + ", Age: " + gs.age + ", Color: " + gs.color);

    //Encapsulation related code (Task 1)
        BankCustomer cust = new BankCustomer("lokendra", 12345678, 1, 23, 'M', 9876543210L);

        System.out.println("Id: "+ cust.getId() +"\nName: " + cust.getName() + "\nAccount Number: " + cust.getAccountNumber() + "\nGender: " + cust.getGender() + "\nAge: " + cust.getAge() + "\nPhone Number: "+ cust.getPhoneNumber());
    }
}