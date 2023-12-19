import Inheritence.GermanShefard;

public class Main {
    public static void main(String[] args){
        GermanShefard gs = new GermanShefard("Babu Khan", 3, "black");
        gs.Running();
        gs.Eating();
        System.out.println("Name: " + gs.name + ", Age: " + gs.age + ", Color: " + gs.color);
    }
}