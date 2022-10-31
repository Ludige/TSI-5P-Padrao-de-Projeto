package Liskov;

public class Quadrado extends FiguraBase{
        //Construtor
        public Quadrado(double lado) {
            super(lado);
        }
        
        //Metodos
        @Override
        public void CalcularArea(){
            setArea(Math.pow(getTamanhoDoLado(), 2));
        }
    
        @Override
        public String toString() {
            return super.toString()+"Area desse Quadrado: "+this.getArea();
        }
}
