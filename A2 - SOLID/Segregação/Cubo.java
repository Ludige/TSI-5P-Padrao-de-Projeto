package Segregação;

public class Cubo implements DuasDimensoes, TresDimensoes{
    private double lado;
    private double volume;
    private double area;

    //Construtor
    public Cubo(double lado) {
        this.lado = lado;
        this.volume = calcularVolume(lado);
        this.area = CalcularArea(lado);
    }


    //Metodos
    @Override
    public double calcularVolume(double lado) {
        return Math.pow(lado, 3);
    }

    @Override
    public double CalcularArea(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    //GSetters
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "{" +
            " lado='" + getLado() + "'" +
            ", volume='" + getVolume() + "'" +
            ", area='" + getArea() + "'" +
            "}";
    }

}
