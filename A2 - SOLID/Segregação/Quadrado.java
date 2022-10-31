package Segregação;

public class Quadrado implements DuasDimensoes{
    private double lado;
    private double area;
    
    //Construtor
    public Quadrado(double lado) {
        this.lado = lado;
        this.area = CalcularArea(lado);
    }

    //Metodos
    @Override
    public double CalcularArea(double lado) {
        return lado * lado;
    }

    //GSetters

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "|" +
            " lado:'" + getLado() + "'" +
            ", area='" + getArea() + "'" +
            "|";
    }

    
}
