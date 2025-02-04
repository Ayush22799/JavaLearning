package Java8;

import java.util.List;

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
}
