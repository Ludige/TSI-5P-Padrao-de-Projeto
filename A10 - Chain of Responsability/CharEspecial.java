package ChainOfResponsability;

public class CharEspecial extends ChainCharacteres{
    @Override
    protected boolean verificarLogin(String nome,String senha) {
        String especial = "@#$%&*";

        int numCharSenha = senha.length();

        for(int i = 0; i < especial.length(); i++){
            
            for(int x = 0; x < numCharSenha; x++){
                if(senha.charAt(x) == especial.charAt(i)){
                     System.out.println("Valido: Caracter Especial");
                    return true;
                }
            }
        }
        System.out.println("Senha Invalida: Nenhum Caracter Especial");
        return false;
    }
}
