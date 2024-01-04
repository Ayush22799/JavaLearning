package CollectionsFramework.Map;

import java.util.HashMap;
import java.util.Iterator;

public class Map {
    public void Task1(){

        //Create a hashmap
        java.util.Map<Integer, String> student = new HashMap<>();

        //Add 5 students
        student.put(1, "Ayush Tamrakar");
        student.put(2, "Lokendra");
        student.put(3, "Faizal");
        student.put(4, "Praful");
        student.put(5, "Umang");

        //print map on console
        Iterator it1 = student.entrySet().iterator();
        System.out.println("\nInitial HashMap's element: \n");
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        //Remove any one student and again print on console
        student.remove(5);

        System.out.println("\nHashMap after removing the element:");
        Iterator it2 = student.entrySet().iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        //get all keys of map and print on console
        System.out.println("\nGet All Keys: \n"+student.keySet());

        //get all values of map and print on console
        System.out.println("\nGet All Values: \n"+student.values());

        //replace first student name to different name and print on console
        student.replace(1,"Ayush Malviya");
        System.out.println("\nFirst Student Replaced with: \n"+student.get(1));
    }
}
