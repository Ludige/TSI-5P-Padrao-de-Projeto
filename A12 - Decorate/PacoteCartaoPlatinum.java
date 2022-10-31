package Decorate;

public class PacoteCartaoPlatinum extends PacoteAdicional{
    public PacoteCartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionando Pacote de Cartão de credito Platinum,  R$ 49,99");
    }
}
