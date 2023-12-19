import Inheritence.GermanShefard;

public class Main {
    public static void main(String[] args){
        GermanShefard gs = new GermanShefard();

        gs.name = "Babu Khan";
        gs.age = 3;
        gs.color = "black";

        gs.Running();
        gs.Eating();
        System.out.println();
    }
}