package Fabrica2;

public class Aplicativo {
    public static void main(String[] args) {
        Floricultura jardimRosas = new JdRosas();

        Flores rosaBranca = jardimRosas.criarRosaBranca();
        Flores rosaVermelha = jardimRosas.criaRosaVermelha();

        rosaBranca.mostrarFlor();
        rosaVermelha.mostrarFlor();

        Floricultura jardimOrquideas = new JdOrquideas();

        Flores orquideaPadrao = jardimOrquideas.criarOrquideaPadrao();
        Flores orquideaRajada = jardimOrquideas.criarOrquideaRajada();

        orquideaPadrao.mostrarFlor();
        orquideaRajada.mostrarFlor();

        Floricultura jardimLirios = new JdLirios();

        Flores lirioBranco = jardimLirios.criarLirioBranco();
        Flores lirioOriental = jardimLirios.criarLirioOriental();

        lirioBranco.mostrarFlor();
        lirioOriental.mostrarFlor();
    }
}
