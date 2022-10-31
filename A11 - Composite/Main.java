package Composite;


public class Main {
    public static void main(String[] args) {

        Caixa geradorDeCaixa = new Caixa();

        geradorDeCaixa.gerarCaixaBronze();
        System.out.println("");
        geradorDeCaixa.gerarCaixaPrata();
        System.out.println("");
        geradorDeCaixa.gerarCaixaOuro();
        System.out.println("");
        geradorDeCaixa.gerarCaixaPlatina();
    }
}
