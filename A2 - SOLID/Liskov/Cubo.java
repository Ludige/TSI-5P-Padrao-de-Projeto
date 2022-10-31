package Liskov;

public class Cubo extends FiguraBase {
    private double volume;
    
    //Construtor
    public Cubo(double tamanhoDoLado) {
        super(tamanhoDoLado);
        this.volume = CalcularVolume();
    }

    //Metodos
    @Override
    public void CalcularArea(){
        setArea(6 * Math.pow(this.getTamanhoDoLado(), 2));
    }

    public double CalcularVolume(){
        return Math.pow(this.getTamanhoDoLado(), 3);
    }

    //GSetters
    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return super.toString()+"Area desse Cubo: "+this.getArea()+ ", Volume desse Cubo: "+this.getVolume();
    }
}
