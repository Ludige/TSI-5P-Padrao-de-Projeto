package Decorate;

public class AssinaturaBase implements Assinatura {
    @Override
    public void assinar() {
        System.out.println("Assinando pacote basico, por R$9,99");
    }
}
