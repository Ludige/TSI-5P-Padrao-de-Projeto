package Decorate;

public abstract class PacoteAdicional implements Assinatura{
    public Assinatura assinatura;

    public PacoteAdicional(Assinatura assinatura){
        this.assinatura = assinatura;
    }

    @Override
    public void assinar() {
        this.assinatura.assinar();        
    }
}
