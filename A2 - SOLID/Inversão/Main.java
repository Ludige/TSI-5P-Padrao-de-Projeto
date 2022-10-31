package Inversão;

public class Main {
    public static void main(String[] args) {
        Lampada lmp = new Lampada();
        Botao interrupitorLampada = new Botao(lmp);
        
        ArCondicionado ac = new ArCondicionado();
        Botao controleAr = new Botao(ac);

        interrupitorLampada.ativar();
        interrupitorLampada.ativar();
        interrupitorLampada.ativar();
        interrupitorLampada.ativar();
        interrupitorLampada.ativar();

        controleAr.ativar();
        controleAr.ativar();
        controleAr.ativar();
        controleAr.ativar();
        controleAr.ativar();
    }
}
