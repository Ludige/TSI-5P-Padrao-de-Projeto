package Decorate;

public class PacoteCaixaMisteriosa extends PacoteAdicional{
    public PacoteCaixaMisteriosa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionando Pacote de Caixa Misteriosa ao combo,  R$ 29,99");
    }
}
