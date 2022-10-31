package ChainOfResponsability;

public class CharMaximo extends ChainCharacteres{

    public CharMaximo() {
    }

    @Override
    protected boolean verificarLogin(String nome,String senha) {
        if(senha.length() <= 16){
            System.out.println("Valido: Numero Maximo de Caracteres");
            mostrarCliente(nome);

            System.out.println("");
            return true;
        }

        if(senha.length() > 16){
            System.out.println("Senha Invalida: Maximo de Caracteres 16");
        }

        System.out.println("Usuario ou Senha invalidos");
        return false;
    }
}
