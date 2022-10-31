package Liskov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quadrado 1: ");
        Quadrado qd = new Quadrado(25.7);
        System.out.println(qd);
        System.out.println("Quadrado 2: ");

        Quadrado qd1 = new Quadrado(35.0);
        System.out.println(qd1);

        System.out.println("**********************");
        System.out.println("Cubo 1: ");
        Cubo cb = new Cubo(41.0);
        System.out.println(cb);


        System.out.println("Cubo 2: ");
        Cubo cb1 = new Cubo(20.8);
        System.out.println(cb1);
    }
}
