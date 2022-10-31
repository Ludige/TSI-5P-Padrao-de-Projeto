package Inversão;

public class ArCondicionado implements LigarDesligar{

    @Override
    public void Ligar() {
        System.out.println("");
        System.out.println("Ar Condicionado Ligado, ventando *vuuuuuu* * barulho de vento*");
    }

    @Override
    public void Desligar() {
        System.out.println("");
        System.out.println("Ar Condicionado Desligado *silencio, finalmente*");
        
    }
}
