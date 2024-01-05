package CollectionsFramework.Map;

import java.util.*;

public class LearnMap {
    public void Task1(){

        System.out.println("\nTASK 1:");

        //Create a hashmap
        Map<Integer, String> student = new HashMap<>();

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

    public void Task2(){

        System.out.println("\nTASK 2: \n");

        //Create LINKEDHASHMAP
        LinkedHashMap<Integer, String> student = new LinkedHashMap<>();

        //Add 5 students
        student.put(1, "Ayush Tamrakar");
        student.put(3, "Lokendra");
        student.put(2, "Faizal");
        student.put(4, "Praful");
        student.put(5, "Umang");

        //print map on console
        Iterator it = student.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void Task3(){
        System.out.println("\nTASK 3: \n");

        //Create a treemap of student id as key and name as value
        Map<Integer,String> tree = new TreeMap<>();

        tree.put(5,"Lokendra");
        tree.put(4,"Ayush Tamrakar");
        tree.put(3,"Faizal");
        tree.put(2,"Praful");
        tree.put(1,"Umang");

        System.out.println("Original order of the objects added to treeMap is: \n" + "5: Lokendra \n4: Ayush Tamrakar \n3: Faizal \n2: Praful \n1: Umang");

        System.out.println("\nBut in TreeMap, the order of object looks like:");


        Iterator key = tree.keySet().iterator();
        Iterator value = tree.values().iterator();

        while (key.hasNext()){
            System.out.println(key.next() + ": " + value.next());
        }

    }
}
