package Inversão;

public class Lampada implements LigarDesligar{

    @Override
    public void Ligar() {
        // Os parenteses são os raios de luz, usa a criatividade pq isso aqui não aceita emoji
        System.out.println("((((( Lampada ))))))");   
    }

    @Override
    public void Desligar() {
        System.out.println("Lampada");
    }
    
}
