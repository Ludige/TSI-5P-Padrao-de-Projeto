package Decorate;

public class Main {
    public static void main(String[] args) {
        Assinatura assinaturaBasica = new AssinaturaBase();
        assinaturaBasica.assinar();

        System.out.println("");
        Assinatura assinaturaComPacotes = new PacoteCaixaMisteriosa(new PacoteCashBack(new AssinaturaBase()));
        assinaturaComPacotes.assinar();

        System.out.println("");
        Assinatura variosPacotes = new PacoteCashBack(new PacoteFreteGratis(new PacoteCaixaMisteriosa(new PacoteCartaoPlatinum(new AssinaturaBase()))));
        variosPacotes.assinar();
    }   
}
