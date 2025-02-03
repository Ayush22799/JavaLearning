package JavaInterviewQuestions;

import java.util.Arrays;

public class mostCommonProblems {
    public static void main(String[] args) {
        //Fibonacci series
        System.out.println(Arrays.toString(fibonacciSeries(12)));

        //Reverse String
        System.out.println(reverseString("balle balle"));

        //Reverse Integer
        System.out.println(reverseInteger(123456));

        //check Anagram
        System.out.println(checkAnagram("def sgt sgt sw", "deg ft sgt ssw"));

        //Check palindrome
        System.out.println(isPalindrome(285582));
    }

    public static int[] fibonacciSeries(int length){
        int[] arr = new int[length];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 1; i < length-1; i++) {
            int temp = arr[i] + arr[i -1 ];
            arr[i+1] = temp;
        }
        return arr;
    }

    public static String reverseString(String input){
        char[] charArray = input.toCharArray();
        String newString = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            newString = newString + charArray[i];
        }
        return newString;
    }

    public static boolean checkAnagram(String a, String b){
        char[] str1 = a.toLowerCase().trim().toCharArray();
        char[] str2 = b.toLowerCase().trim().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static int reverseInteger(int num){
        int reverse = 0;
        while(num>0){
            int a = num % 10;
            reverse = reverse * 10 + a;
            num = num / 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int num){
        int reverseInt = reverseInteger(num);
        return num == reverseInt;
    }
}
