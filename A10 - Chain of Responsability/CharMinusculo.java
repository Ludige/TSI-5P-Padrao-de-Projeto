package ChainOfResponsability;

public class CharMinusculo extends ChainCharacteres{

    public CharMinusculo() {
    }

    @Override
    protected boolean verificarLogin(String nome,String senha) {
        String minusculo = "abcdefghijklmnopqrstuvwxyz";
        
        int numCharSenha = senha.length();

        for(int i = 0; i < minusculo.length(); i++){

            for(int x = 0; x < numCharSenha; x++){
                if(senha.charAt(x) == minusculo.charAt(i)){
                    System.out.println("Valido: Caracter Minuscula");
                    return true;
                }
            }
        }
        System.out.println("Senha Invalida: Nenhuma letra Minuscula");
        return false;
    }
}
