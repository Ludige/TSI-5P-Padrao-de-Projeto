package ChainOfResponsability;

public class CharNumerico extends ChainCharacteres{

    public CharNumerico() {
    }

    @Override
    protected boolean verificarLogin(String nome,String senha) {
        String numerico = "0123456789";
        
        int numCharSenha = senha.length();

        for(int i = 0; i < numerico.length(); i++){
            
            for(int x = 0; x < numCharSenha; x++){
                if(senha.charAt(x) == numerico.charAt(i)){
                    System.out.println("Valido: Pelomenos 1 numero");
                    return true;
                }
            }
        }
        System.out.println("Senha Invalida: Nenhum Numero");
        return false;
    }
}
