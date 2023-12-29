package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {
    public void task1(){
        System.out.println("TASK 1: \n");
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 5; i > 0; i--) {
            arr.add(i);
        }
        System.out.println( "Initial Array List is: " + arr);

        arr.remove(2);

        System.out.println( "Element '3' is removed. Updated Array List is: " + arr);
    }

    public void task2(){
        System.out.println("\nTASK 2: \n");
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 5; i > 0; i--) {
            arr.add(i);
        }
        System.out.println( "Initial Array List is: " + arr);

        Collections.sort(arr);

        System.out.println( "Sorted Array List is: " + arr);
    }
}
