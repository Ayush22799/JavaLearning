package Java8.LamdaExp;

//Create a functional interface named Sum
@FunctionalInterface
public interface Sum {

   //functional interface have one abstract method named add
   void add(double a, double b);
}
