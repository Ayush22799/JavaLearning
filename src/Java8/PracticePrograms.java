package Java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticePrograms {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "Test" ,"AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,53,15);

        /* Questions for filter function */
        System.out.println("___________ Filter Function _____________\n");
        System.out.println("1. Print odd Numbers: ");
        printOddNumbers(numbers);

        System.out.println("2. Print all Courses Individually: ");
        individualCourses(courses);

        System.out.println("\n3. Print Course that contains \"String\" ");
        printCharOfString(courses);

        System.out.println("\n4. Print courses whose name has at least 4 characters: ");
        coursesWithFourDigit(courses);

        /* Questions for Map function */
        System.out.println("\n___________ MAP Function _____________");
        System.out.println("\n1. Print square of numbers: ");
        squareOfNumbers(numbers);
        System.out.println("\n2. Print cubes of odd numbers: ");
        cubesOfOddNumbers(numbers);
        System.out.println("\n3. Print length of name of each course: ");
        numberOfCharacters(courses);

        /* Questions for Reduce function */
        System.out.println("\n___________ Reduce Function _____________");
        System.out.println("\n1. Print the sum of total elements present in list: ");
        sumOfElementsInList(numbers);
        System.out.println("\n2. Print the sum of squares of each number in list: ");
        sumOfSquares(numbers);
        System.out.println("\n3. Print the sum of cubes of each number in list: ");
        sumOfCubes(numbers);
        System.out.println("\n4. Print the sum of odd numbers in list: ");
        sumOfOddNumbers(numbers);

        /* Questions for Distinct and sorted function */
        System.out.println("\n___________ Distinct & Sorted Function _____________");
        System.out.println("\n1. Print the distinct(ignore duplicates) Numbers from list: ");
        distinctNumbers(numbers);
        System.out.println("\n2. Print the courses from list in decreasing order: ");
        reverseSorted(courses);

        /* Questions for Collect function */
        System.out.println("\n___________ Collect Function _____________");
        System.out.println("\n1. Print the list of even Numbers filtered from list: ");
        listWithEvenNums(numbers);
        System.out.println("\n2. Print the list of length of all course titles from list: ");
        listOfCourseTitleSize(courses);
    }

    public static void printOddNumbers(List<Integer> list){
        list.stream().filter(a -> a%2!=0).forEach(System.out::println);
    }

    public static void individualCourses(List<String> courses){
        courses.forEach(System.out::println);
    }

    public static void printCharOfString(List<String> courses){
    courses.stream().filter(c -> c.contains("Spring")).forEach(System.out::println);
    }
    public static void coursesWithFourDigit(List<String> courses){
        courses.stream().filter(a -> a.length() >= 4).forEach(System.out::println);
    }

    public static void squareOfNumbers(List<Integer> numberList){
        numberList.stream().map(a -> a*a).forEach(System.out::println);
    }

    public static void cubesOfOddNumbers(List<Integer> numberList){
        numberList.stream().filter(a -> a%2 != 0).map(a -> a * a * a).forEach(System.out::println);
    }

    public static void numberOfCharacters(List<String> courses){
        courses.stream().map(String::length).forEach(System.out::println);
    }
    public static void sumOfElementsInList(List<Integer> numberList){
        System.out.println(numberList.stream().reduce(0, Integer::sum));
    }
    public static void sumOfSquares(List<Integer> numberList){
        System.out.println(numberList.stream().map(a -> a * a).reduce(0,Integer::sum));
    }
    public static void sumOfCubes(List<Integer> numberList){
        System.out.println(numberList.stream().map(a -> a * a * a).reduce(0,Integer::sum));
    }
    public static void sumOfOddNumbers(List<Integer> numberList){
        System.out.println(numberList.stream().filter(a -> a % 2 !=0).reduce(0,Integer::sum));
    }
    public static void distinctNumbers(List<Integer> numberList){
        System.out.println(numberList.stream().distinct().collect(Collectors.toList()));
    }
    public static void reverseSorted(List<String> courses){
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    public static void listWithEvenNums(List<Integer> numberList){
        System.out.println(numberList.stream().filter(a->a%2==0).collect(Collectors.toList()));
    }
    public static void listOfCourseTitleSize(List<String> courses){
        System.out.println(courses.stream().map(String::length).collect(Collectors.toList()));
    }
}
