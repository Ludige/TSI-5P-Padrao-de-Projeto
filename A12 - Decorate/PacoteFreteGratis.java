package Decorate;

public class PacoteFreteGratis extends PacoteAdicional{
    public PacoteFreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionando Pacote de Frete Gratis,  R$ 49,99");
    }
}
