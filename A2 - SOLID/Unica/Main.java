package Unica;

public class Main {
    public static void main(String[] args) {
        CalcularArea area = new CalcularArea();
        CalcularVolume vol = new CalcularVolume();

        System.out.println("Area de Cubo de 5cm de lado");
        System.out.println("Area: "+area.calcularArea(5.0));
        System.out.println("**************************");
        System.out.println("Volume do Cubo de 10cm de lado");
        System.out.println("Volume: "+vol.calcularVolume(10.0));
    }
}