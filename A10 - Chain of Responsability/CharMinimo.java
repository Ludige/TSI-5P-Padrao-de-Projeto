package ChainOfResponsability;

public class CharMinimo  extends ChainCharacteres{

    public CharMinimo() {
    }

    @Override
    protected boolean verificarLogin(String nome,String senha) {
        if(senha.length() >= 8){
            System.out.println("Valido: Numero Minimo de Caracteres");
            return true;
        }
        System.out.println("Senha Invalida: Minimo de Caracteres 8");
        return false;
    }
}
