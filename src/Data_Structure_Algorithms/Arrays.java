package Data_Structure_Algorithms;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //Find no of days above average temperature
        numOfDaysAboveAvg();
    }

    public static void numOfDaysAboveAvg(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int ans = 0;
        System.out.print("How many days' temperatures?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Day " + i+1 + "'s high temp: ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int avg = sum/n;
        System.out.println("Average = " + avg);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg){
                ans = i;
            }
        }
        System.out.println(ans + " days above average");
    }
}
