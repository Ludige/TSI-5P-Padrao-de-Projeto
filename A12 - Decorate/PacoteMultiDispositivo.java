package Decorate;

public class PacoteMultiDispositivo extends PacoteAdicional{
    public PacoteMultiDispositivo(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionando Pacote de Streaming em Multiplos Dispositivos,  R$ 19,99");
     }
}
